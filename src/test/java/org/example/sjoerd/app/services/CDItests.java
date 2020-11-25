package org.example.sjoerd.app.services;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.inject.WeldInstance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CDItests {

    Weld weld;
    WeldContainer cdiContainer;

    @BeforeEach
    void setup () {
        weld = new Weld ();
        cdiContainer = weld.initialize ();
    }

    @Test
    void fietserGaatFietsenMetCDIDependecies () {
        WeldInstance<Fietser> handle = cdiContainer.select (Fietser.class);
        Fietser fietser = (Fietser) handle.get ();
        fietser.gaatFietsen ();
        weld.shutdown ();
    }

    @Test
    void wandelaarLaatHondenUitCDIDependecies () {
        WeldInstance<Wandelaar> handle = cdiContainer.select (Wandelaar.class);
        Wandelaar wandelaar = (Wandelaar) handle.get ();
        wandelaar.gaatWandelen ();
        weld.shutdown ();
    }
}
