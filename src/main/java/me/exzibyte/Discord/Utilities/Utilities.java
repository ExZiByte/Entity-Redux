package me.exzibyte.Discord.Utilities;

import org.bson.Document;

import java.util.HashMap;

public class Utilities {

    Database db = new Database();
    public static HashMap<String, String> settings = new HashMap<String, String>();

    public void load(){

        db.connect();
        Document guild = db.getCollection("guild").find().first();
        settings.put("prefix", guild.get("prefix").toString());
        settings.put("logChannel", guild.get("logChannelID").toString());
        settings.put("joinLog", guild.get("joinLogID").toString());
        settings.put("ownerRole", guild.get("ownerRoleID").toString());
        settings.put("administratorRole", guild.get("administratorRoleID").toString());
        settings.put("moderatorRole", guild.get("moderatorRoleID").toString());
        settings.put("helperRole", guild.get("helperRoleID").toString());
        settings.put("roleAssignMessage", guild.get("roleAssignMessageID").toString());
        settings.put("rulesMessage", guild.get("rulesAcceptMessageID").toString());
        settings.put("ruleEmote", guild.get("rulesAcceptReactionEmote").toString());

        System.out.println(settings);
        db.close();
    }

    public String getPrefix(){
        return settings.get("prefix");
    }

    public void setPrefix(String newPrefix){
        db.connect();
        Document guild = db.getCollection("guild").find().first();
        guild.replace("prefix", getPrefix() ,newPrefix);
        settings.put("prefix", newPrefix);
        db.close();
    }

}
