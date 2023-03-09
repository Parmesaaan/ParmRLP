package com.parmrlp;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("parmrlp")
public interface ParmRLPConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello!";
	}
}

	/*
	Config types:
	-------------
	boolean = Checkbox
	int = Spinner
	awt.Dimension = Spinners x2
	String = Text box
	Color = Color picker
	Enum = Combobox

	RuneLite stores the values automatically.
	Can be called after @Inject ParmRLPConfig elsewhere and calling config.settingName()
	See https://github.com/runelite/runelite/wiki/Code-Conventions

	 */