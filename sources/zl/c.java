package zl;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c {
    @l
    public static final <R> R a(@l CharSequence charSequence, @k x00.l<? super CharSequence, ? extends R> block) {
        g0.q(block, "block");
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        return block.invoke(charSequence);
    }

    @k
    public static final CharSequence b(@l CharSequence charSequence, @k CharSequence charSequence2) {
        g0.q(charSequence2, "default");
        if (charSequence != null && charSequence.length() > 0) {
            return charSequence;
        }
        if (charSequence2.length() > 0) {
            return charSequence2;
        }
        throw new IllegalStateException("Not available");
    }

    @k
    public static final CharSequence c(@l CharSequence charSequence, @l CharSequence charSequence2) {
        return (charSequence == null || charSequence.length() == 0) ? charSequence2 != null ? charSequence2 : "" : charSequence;
    }
}
