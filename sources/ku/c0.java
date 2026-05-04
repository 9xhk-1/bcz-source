package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c0 extends w {

    /* renamed from: b, reason: collision with root package name */
    public final ju.m f68621b;

    public c0(Collection<a> collection, ju.m mVar) {
        super(collection);
        this.f68621b = mVar;
    }

    public boolean f(String str) {
        s0 d11 = u0.d(str);
        ArrayList arrayList = new ArrayList(this.f68855a);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar instanceof w) {
                if (aVar instanceof u) {
                    throw new ConfigException.WrongType(this.f68621b, "The ConfigDocument had an array at the root level, and values cannot be modified inside an array.");
                }
                if (aVar instanceof a0) {
                    return ((a0) aVar).h(d11);
                }
            }
        }
        throw new ConfigException.BugOrBroken("ConfigNodeRoot did not contain a value");
    }

    @Override // ku.w
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public c0 e(Collection<a> collection) {
        throw new ConfigException.BugOrBroken("Tried to indent the root object");
    }

    public c0 h(String str, b bVar, ConfigSyntax configSyntax) {
        ArrayList arrayList = new ArrayList(this.f68855a);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar instanceof w) {
                if (aVar instanceof u) {
                    throw new ConfigException.WrongType(this.f68621b, "The ConfigDocument had an array at the root level, and values cannot be modified inside an array.");
                }
                if (aVar instanceof a0) {
                    if (bVar == null) {
                        arrayList.set(i11, ((a0) aVar).k(str, configSyntax));
                    } else {
                        arrayList.set(i11, ((a0) aVar).m(str, bVar, configSyntax));
                    }
                    return new c0(arrayList, this.f68621b);
                }
            }
        }
        throw new ConfigException.BugOrBroken("ConfigNodeRoot did not contain a value");
    }

    public w i() {
        Iterator<a> it = this.f68855a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next instanceof w) {
                return (w) next;
            }
        }
        throw new ConfigException.BugOrBroken("ConfigNodeRoot did not contain a value");
    }
}
