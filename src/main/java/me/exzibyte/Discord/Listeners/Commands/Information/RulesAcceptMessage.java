package me.exzibyte.Discord.Listeners.Commands.Information;

import me.exzibyte.Discord.Utilities.Color;
import me.exzibyte.Discord.Utilities.Permissions;
import me.exzibyte.Discord.Utilities.Utilities;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class RulesAcceptMessage extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        Utilities utils = new Utilities();
        Color color = new Color();
        EmbedBuilder eb = new EmbedBuilder();
        Permissions perm = new Permissions();
        if(args[0].equalsIgnoreCase(utils.getPrefix() + "setuprules")){
            if(perm.isHeadAdmin(event) || perm.isDeveloper(event)) {
                eb.setDescription("**Dead By Daylight Hub Server Rules**\n~~--------------------------------------------------~~\n\n**1)** No NSFW content outside of #nsfw.\n**2)** No talking about sexual assault/anything against [Discord TOS](https://discord.com/new/terms \"Discord's Terms of Service\").\n**3)** Do not spam. (Spam is constituted as repeatedly sending the same or similar messages.)\n**4)** No bullying other server members.\n**5)** No harassment of other server members.\n**6)** No toxicity.\n**7)** Staff instructions are final unless overruled by a staff member higher then them.\n**8)** Use the correct channels for the topic at hand (You can look in the channel's topic bar to see which channel is for what).\n**9)** Do not use alternate accounts.\n**10)** Do not under any circumstance take it upon yourself to act as staff or attempt to pursade staff to punish someone.\n**11)** Do not plan raids or attacks on other servers or users.\n**12)** Do not reveal sensitive or private information about a user without the user's express consent.\n**13)** Do not advertise outside of " + event.getGuild().getTextChannelById("583052605652074499").getAsMention() + " (Including direct messages).\n\nOnce finished reading the rules reaction with the emote matching the footer image to gain entry into the server.");
                eb.setColor(color.purpleHaze);
                eb.setFooter("Dead By Daylight Hub Rules"/*, utils.getCurrentRuleEmote(event).getImageUrl()*/);

                event.getChannel().sendMessage(eb.build()).queue();
            }
        }
    }

}
