package me.lexo;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandPlayMusic implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player && args.length > 0) {
            Player player = (Player) sender;
            Location commandBlockLocation = player.getLocation();

            int radio = Integer.parseInt(args[0]);

            for (Player targetPlayer : Bukkit.getServer().getOnlinePlayers()) {
                if (targetPlayer.getLocation().distance(commandBlockLocation) <= radio) {
                    // Reproducir música para el jugador dentro del radio especificado
                }
            }
        }

        return true;
    }
}


