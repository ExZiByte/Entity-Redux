package me.exzibyte.Discord;

import me.exzibyte.Discord.Utilities.Config;
import me.exzibyte.Discord.Utilities.Utilities;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

import javax.security.auth.login.LoginException;

public class Entity {

    static final Utilities utils = new Utilities();
    static final Config config = new Config();

    public Entity() throws LoginException {
        JDABuilder entity = JDABuilder.createDefault(config.get("devtoken"));

        entity.setActivity(Activity.watching("pron"));
        entity.setStatus(OnlineStatus.DO_NOT_DISTURB);

        entity.enableIntents(GatewayIntent.GUILD_MEMBERS);
        entity.setMemberCachePolicy(MemberCachePolicy.ALL);

        entity.addEventListeners(
        );

        entity.build();

    }

    public static void main(String[] args) throws LoginException {
        utils.load();
        new Entity();
    }

}
