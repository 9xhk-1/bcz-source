package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a0<E> extends f<E> {

    /* renamed from: x, reason: collision with root package name */
    public static final Integer f86762x = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: w, reason: collision with root package name */
    public final int f86763w;

    public a0(int i11) {
        super(i11);
        this.f86763w = Math.min(i11 / 4, f86762x.intValue());
    }
}
