package com.sutherlandpb.adventure.alternativefuel.prompt;



import com.sutherlandpb.adventure.alternativefuel.Player.PlayerDataContainer;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;


@Component
public class RoomPromptProvider implements PromptProvider {

    @Autowired
    private PlayerDataContainer playerDataContainer;

    @Override
    public AttributedString getPrompt() {
        String room = "Start";
        if (playerDataContainer.getCurrentRoom() != null) {
            room = playerDataContainer.getCurrentRoom().getName();
        }

        return new AttributedString(room + ":>", AttributedStyle.DEFAULT.foreground(AttributedStyle.YELLOW));
    }
}