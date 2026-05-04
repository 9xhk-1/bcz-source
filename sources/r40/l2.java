package r40;

import kotlinx.datetime.Month;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final /* synthetic */ class l2 {
    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final Month a(int i11) {
        if (1 > i11 || i11 >= 13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return (Month) Month.getEntries().get(i11 - 1);
    }

    public static final int b(@m80.k Month month) {
        kotlin.jvm.internal.g0.p(month, "<this>");
        return month.ordinal() + 1;
    }
}
