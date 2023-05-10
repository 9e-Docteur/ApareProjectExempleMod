package com.username.modname;

import be.ninedocteur.apare.Apare;
import be.ninedocteur.apare.mod.Mod;
import be.ninedocteur.apare.mod.ModAddon;
import be.ninedocteur.apare.utils.Logger;

@Mod(ExempleMod.class)
public class ExempleMod extends ModAddon {
    public ExempleMod() {
        super("Exemple Mod", "1.0", "Author Name");
    }

    @Override
    public void loadMod() {
        Apare.logger.send("Exemple mod working!", Logger.Type.SUCCESS);
    }
}
