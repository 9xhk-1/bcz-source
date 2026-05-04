package j;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j<RowType> extends i<RowType> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@m80.k x00.l<? super l.d, ? extends RowType> mapper) {
        super(mapper);
        g0.p(mapper, "mapper");
    }

    public abstract void j(@m80.k a aVar);

    public abstract void k(@m80.k a aVar);
}
