package j2;

import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements f.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f63145a;

    public f() {
    }

    @Override // com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        this.f63145a = ((Boolean) fVar.M("active", Boolean.class, jsonValue)).booleanValue();
    }

    public boolean a() {
        return this.f63145a;
    }

    public void d(f fVar) {
        this.f63145a = fVar.f63145a;
    }

    public void e(boolean z11) {
        this.f63145a = z11;
    }

    @Override // com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        fVar.F0("active", Boolean.valueOf(this.f63145a));
    }

    public f(f fVar) {
        this.f63145a = fVar.f63145a;
    }
}
