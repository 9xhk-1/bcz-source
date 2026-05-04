package gi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.baicizhan.client.business.util.KotlinExtKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClipboardUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtil.kt\ncom/baicizhan/main/utils/ClipboardUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes4.dex */
public final class d {
    public static final void a() {
        Object systemService = KotlinExtKt.getGlobalApplicationContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setText("");
        }
    }

    @m80.l
    public static final String b() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence coerceToText;
        try {
            Object systemService = KotlinExtKt.getGlobalApplicationContext().getSystemService("clipboard");
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null) {
                return null;
            }
            if (primaryClip.getItemCount() <= 0) {
                primaryClip = null;
            }
            if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null || (coerceToText = itemAt.coerceToText(KotlinExtKt.getGlobalApplicationContext())) == null) {
                return null;
            }
            return coerceToText.toString();
        } catch (Exception e11) {
            qb.c.c("getClipBoardText", "", e11);
            return null;
        }
    }

    public static final boolean c(@m80.k Context context) {
        kotlin.jvm.internal.g0.p(context, "<this>");
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        return clipboardManager != null && clipboardManager.hasPrimaryClip();
    }
}
