package v10;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import v10.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w extends y implements f20.n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Field f92869a;

    public w(@m80.k Field member) {
        kotlin.jvm.internal.g0.p(member, "member");
        this.f92869a = member;
    }

    @Override // f20.n
    public boolean C() {
        return false;
    }

    @Override // f20.n
    public boolean K() {
        return P().isEnumConstant();
    }

    @Override // v10.y
    @m80.k
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public Field P() {
        return this.f92869a;
    }

    @Override // f20.n
    @m80.k
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public e0 getType() {
        e0.a aVar = e0.f92833a;
        Type genericType = P().getGenericType();
        kotlin.jvm.internal.g0.o(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
