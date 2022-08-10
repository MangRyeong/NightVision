package skh6075.nightvision;

import org.bukkit.Effect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public final class NightVision extends JavaPlugin {
    private final static String prefix = "§l§6 [!]§r§7 ";

    @Override
    public void onEnable() {
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().equalsIgnoreCase("야간투시") && sender instanceof Player){
            Player player = (Player) sender;
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999 * 20, 1, false, false, true));
            player.sendMessage(prefix + "야간투시를 부여받았습니다.");
        }
        return true;
    }
}
