package l0;

import java.io.File;
import m80.k;
import o0.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements b<File> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69109a;

    public a(boolean z11) {
        this.f69109a = z11;
    }

    @Override // l0.b
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@k File file, @k j jVar) {
        if (!this.f69109a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
