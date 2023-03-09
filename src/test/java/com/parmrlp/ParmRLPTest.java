package com.parmrlp;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ParmRLPTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ParmRLPPlugin.class);
		RuneLite.main(args);
	}
}