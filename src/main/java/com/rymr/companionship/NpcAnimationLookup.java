package com.rymr.companionship;

import net.runelite.cache.definitions.NpcDefinition;
import net.runelite.client.game.NPCManager;

public class NPCDefinitionLookup {

    private final NPCManager npcManager;

    public NPCDefinitionLookup(NPCManager npcManager) {
        this.npcManager = npcManager;
    }

    public NpcDefinition getNPCDefinition(int npcId) {
        NpcDefinition npcDef = npcManager.getNpcInfo(npcId);
        if (npcDef == null) {
            throw new IllegalArgumentException("Invalid NPC ID: " + npcId);
        }
        return npcDef;
    }

}