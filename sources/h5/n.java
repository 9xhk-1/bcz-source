package h5;

import com.baicizhan.app.biz.game.model.RoundType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n {
    public static final boolean a(@m80.k RoundType roundType) {
        kotlin.jvm.internal.g0.p(roundType, "<this>");
        return roundType == RoundType.AI_LEADS_U || roundType == RoundType.AI_LEADS_U_R;
    }
}
