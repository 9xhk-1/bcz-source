package androidx.compose.foundation.text.input.internal;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import java.util.Collection;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class TextFieldDragAndDropNode_androidKt {
    @m80.k
    public static final DragAndDropTargetModifierNode textFieldDragAndDropNode(@m80.k final x00.a<? extends Set<MediaType>> aVar, @m80.k final x00.p<? super ClipEntry, ? super ClipMetadata, Boolean> pVar, @m80.k final x00.l<? super DragAndDropEvent, g2> lVar, @m80.l final x00.l<? super DragAndDropEvent, g2> lVar2, @m80.l final x00.l<? super DragAndDropEvent, g2> lVar3, @m80.l final x00.l<? super Offset, g2> lVar4, @m80.l final x00.l<? super DragAndDropEvent, g2> lVar5, @m80.l final x00.l<? super DragAndDropEvent, g2> lVar6, @m80.l final x00.l<? super DragAndDropEvent, g2> lVar7) {
        return DragAndDropNodeKt.DragAndDropTargetModifierNode(new x00.l<DragAndDropEvent, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(DragAndDropEvent dragAndDropEvent) {
                ClipDescription clipDescription = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription();
                Set<MediaType> invoke = aVar.invoke();
                boolean z11 = false;
                if (!(invoke instanceof Collection) || !invoke.isEmpty()) {
                    for (MediaType mediaType : invoke) {
                        if (kotlin.jvm.internal.g0.g(mediaType, MediaType.Companion.getAll()) || clipDescription.hasMimeType(mediaType.getRepresentation())) {
                            z11 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z11);
            }
        }, new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onChanged(DragAndDropEvent dragAndDropEvent) {
                x00.l<DragAndDropEvent, g2> lVar8 = lVar5;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                    g2 g2Var = g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
                lVar.invoke(dragAndDropEvent);
                return pVar.invoke(AndroidClipboardManager_androidKt.toClipEntry(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()), AndroidClipboardManager_androidKt.toClipMetadata(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipDescription())).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEnded(DragAndDropEvent dragAndDropEvent) {
                x00.l<DragAndDropEvent, g2> lVar8 = lVar7;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                    g2 g2Var = g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onEntered(DragAndDropEvent dragAndDropEvent) {
                x00.l<DragAndDropEvent, g2> lVar8 = lVar3;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                    g2 g2Var = g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onExited(DragAndDropEvent dragAndDropEvent) {
                x00.l<DragAndDropEvent, g2> lVar8 = lVar6;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                    g2 g2Var = g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onMoved(DragAndDropEvent dragAndDropEvent) {
                DragEvent androidDragEvent = DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent);
                x00.l<Offset, g2> lVar8 = lVar4;
                if (lVar8 != null) {
                    float x11 = androidDragEvent.getX();
                    float y11 = androidDragEvent.getY();
                    lVar8.invoke(Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(x11) << 32) | (Float.floatToRawIntBits(y11) & 4294967295L))));
                    g2 g2Var = g2.f100423a;
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public void onStarted(DragAndDropEvent dragAndDropEvent) {
                x00.l<DragAndDropEvent, g2> lVar8 = lVar2;
                if (lVar8 != null) {
                    lVar8.invoke(dragAndDropEvent);
                    g2 g2Var = g2.f100423a;
                }
            }
        });
    }

    public static /* synthetic */ DragAndDropTargetModifierNode textFieldDragAndDropNode$default(x00.a aVar, x00.p pVar, x00.l lVar, x00.l lVar2, x00.l lVar3, x00.l lVar4, x00.l lVar5, x00.l lVar6, x00.l lVar7, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            lVar2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar3 = null;
        }
        if ((i11 & 32) != 0) {
            lVar4 = null;
        }
        if ((i11 & 64) != 0) {
            lVar5 = null;
        }
        if ((i11 & 128) != 0) {
            lVar6 = null;
        }
        if ((i11 & 256) != 0) {
            lVar7 = null;
        }
        return textFieldDragAndDropNode(aVar, pVar, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7);
    }
}
