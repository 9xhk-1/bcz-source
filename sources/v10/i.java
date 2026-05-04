package v10;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i extends h implements f20.c {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Annotation f92849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.l n20.f fVar, @m80.k Annotation annotation) {
        super(fVar, null);
        kotlin.jvm.internal.g0.p(annotation, "annotation");
        this.f92849c = annotation;
    }

    @Override // f20.c
    @m80.k
    public f20.a b() {
        return new g(this.f92849c);
    }
}
