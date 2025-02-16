package com.randommod.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.GameMode;

public class ModCommands {
    public static void registerCommands(){
        CommandRegistrationCallback.EVENT.register(ModCommands::register);
    }


    private static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        // Register alongside the default `/gamemode`
        dispatcher.register(CommandManager.literal("gamemode")
                .then(CommandManager.argument("mode", IntegerArgumentType.integer(0, 3))
                        .executes(context -> {
                            ServerCommandSource source = context.getSource();
                            int mode = IntegerArgumentType.getInteger(context, "mode");

                            if (source.getEntity() instanceof ServerPlayerEntity player) {
                                GameMode gameMode = switch (mode) {
                                    case 0 -> GameMode.SURVIVAL;
                                    case 1 -> GameMode.CREATIVE;
                                    case 2 -> GameMode.ADVENTURE;
                                    case 3 -> GameMode.SPECTATOR;
                                    default -> null;
                                };

                                if (gameMode != null) {
                                    player.changeGameMode(gameMode);
                                    source.sendFeedback(() -> Text.literal("Set gamemode to " + gameMode.getName()), true);
                                    return Command.SINGLE_SUCCESS;
                                }
                            }
                            return 0;
                        })));
    }
}
