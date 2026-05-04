package androidx.compose.foundation.content;

import a00.r0;
import android.content.ClipData;
import android.content.ClipDescription;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransferableContent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferableContent.android.kt\nandroidx/compose/foundation/content/TransferableContent_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes.dex */
public final class TransferableContent_androidKt {
    @l
    @ExperimentalFoundationApi
    public static final TransferableContent consume(@k TransferableContent transferableContent, @k x00.l<? super ClipData.Item, Boolean> lVar) {
        ClipData clipData = transferableContent.getClipEntry().getClipData();
        if (clipData.getItemCount() != 1) {
            int itemCount = clipData.getItemCount();
            ArrayList arrayList = null;
            for (int i11 = 0; i11 < itemCount; i11++) {
                ClipData.Item itemAt = clipData.getItemAt(i11);
                if (!lVar.invoke(itemAt).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() != clipData.getItemCount()) {
                ClipDescription clipDescription = new ClipDescription(transferableContent.getClipMetadata().getClipDescription());
                ClipData clipData2 = new ClipData(clipDescription, (ClipData.Item) r0.G2(arrayList));
                int size = arrayList.size();
                for (int i12 = 1; i12 < size; i12++) {
                    clipData2.addItem((ClipData.Item) arrayList.get(i12));
                }
                return new TransferableContent(AndroidClipboardManager_androidKt.toClipEntry(clipData2), AndroidClipboardManager_androidKt.toClipMetadata(clipDescription), transferableContent.m328getSourcekB6V9T0(), transferableContent.getPlatformTransferableContent(), null);
            }
        } else if (lVar.invoke(clipData.getItemAt(0)).booleanValue()) {
            return null;
        }
        return transferableContent;
    }

    @ExperimentalFoundationApi
    public static final boolean hasMediaType(@k TransferableContent transferableContent, @k MediaType mediaType) {
        return transferableContent.getClipMetadata().getClipDescription().hasMimeType(mediaType.getRepresentation());
    }

    @l
    public static final String readPlainText(@k ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount; i11++) {
            z11 = z11 || clipEntry.getClipData().getItemAt(i11).getText() != null;
        }
        if (!z11) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int itemCount2 = clipEntry.getClipData().getItemCount();
        boolean z12 = false;
        for (int i12 = 0; i12 < itemCount2; i12++) {
            CharSequence text = clipEntry.getClipData().getItemAt(i12).getText();
            if (text != null) {
                if (z12) {
                    sb2.append("\n");
                }
                sb2.append(text);
                z12 = true;
            }
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
