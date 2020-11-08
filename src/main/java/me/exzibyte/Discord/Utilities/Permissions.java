package me.exzibyte.Discord.Utilities;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class Permissions {

    public boolean isHeadAdmin(GuildMessageReceivedEvent event){
        return event.getMember().getRoles().contains(event.getGuild().getRoleById("552572692163985408"));
    }

    public boolean isAdmin(GuildMessageReceivedEvent event){
        return event.getMember().getRoles().contains(event.getGuild().getRoleById("608869161594126346"));
    }

    public boolean isDeveloper(GuildMessageReceivedEvent event){
        return event.getMember().getRoles().contains(event.getGuild().getRoleById("633462881811300352"));
    }

    public boolean isModerator(GuildMessageReceivedEvent event){
        return event.getMember().getRoles().contains(event.getGuild().getRoleById("540745858929393689"));
    }

    public boolean isHelper(GuildMessageReceivedEvent event){
        return event.getMember().getRoles().contains(event.getGuild().getRoleById("653654738327306281"));
    }
}
