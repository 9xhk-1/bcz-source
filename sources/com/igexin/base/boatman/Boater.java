package com.igexin.base.boatman;

import com.igexin.base.api.ShipsManager;
import com.igexin.base.boatman.receive.IBoatResult;
import com.igexin.base.boatman.receive.Site;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class Boater<Bag, V> {
    public abstract String getTag();

    public void postASync(Bag bag, IBoatResult<V> iBoatResult) {
        ShipsManager.get().getShip().a(this, bag, iBoatResult);
    }

    public void postSticky(Bag bag, IBoatResult<V> iBoatResult) {
        b ship = ShipsManager.get().getShip();
        String tag = getTag();
        ship.f37059a.lock();
        try {
            boolean containsKey = ship.f37060b.containsKey(getTag());
            if (!containsKey) {
                if (ship.f37061c.get(tag) == null) {
                    ship.f37061c.put(tag, new ArrayList());
                }
                ship.f37061c.get(tag).add(new a(bag, iBoatResult));
            }
            ship.f37059a.unlock();
            if (containsKey) {
                ship.a(this, bag, iBoatResult);
            }
        } catch (Throwable th2) {
            ship.f37059a.unlock();
            throw th2;
        }
    }

    public V postSync(Bag bag) {
        Site site = ShipsManager.get().getShip().f37060b.get(getTag());
        if (site == null) {
            return null;
        }
        return (V) site.onArrived(bag);
    }

    public boolean removeSticky(Bag bag) {
        return ShipsManager.get().getShip().a(this, bag);
    }
}
