package com.username.modname;

import be.ninedocteur.apare.Apare;
import be.ninedocteur.apare.api.Mod;
import be.ninedocteur.apare.api.ModAddon;
import be.ninedocteur.apare.utils.Logger;

@Mod(ExempleMod.class)
public class ExempleMod extends ModAddon {
    public ExempleMod() {
        super("modName", "modVersion");
    }

    @Override
    public void loadMod() {
        Apare.logger.send("Exemple mod working!", Logger.Type.SUCCESS);
    }
}
