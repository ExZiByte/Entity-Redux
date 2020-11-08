package me.exzibyte.Discord.Listeners.Commands.Moderation;

import me.exzibyte.Discord.Utilities.Color;
import me.exzibyte.Discord.Utilities.Permissions;
import me.exzibyte.Discord.Utilities.Utilities;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Settings extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        Utilities utils = new Utilities();
        EmbedBuilder eb = new EmbedBuilder();
        EmbedBuilder log = new EmbedBuilder();
        Color color = new Color();
        Permissions perm = new Permissions();

        if(args[0].equalsIgnoreCase(utils.getPrefix() + "set")){
            if(perm.isHeadAdmin(event) || perm.isDeveloper(event)){

            }
        }
    }

}
