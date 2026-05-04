package androidx.compose.ui.text;

import a00.h0;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Savers_androidKt {

    @k
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = SaverKt.Saver(new p<SaverScope, PlatformParagraphStyle, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
            return h0.t(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m4396boximpl(platformParagraphStyle.m4477getEmojiSupportMatch_3YsG6Y())));
        }
    }, new l<Object, PlatformParagraphStyle>() { // from class: androidx.compose.ui.text.Savers_androidKt$PlatformParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final PlatformParagraphStyle invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Boolean bool = obj2 != null ? (Boolean) obj2 : null;
            g0.m(bool);
            boolean booleanValue = bool.booleanValue();
            Object obj3 = list.get(1);
            EmojiSupportMatch emojiSupportMatch = obj3 != null ? (EmojiSupportMatch) obj3 : null;
            g0.m(emojiSupportMatch);
            return new PlatformParagraphStyle(emojiSupportMatch.m4402unboximpl(), booleanValue, (v) null);
        }
    });

    @k
    private static final Saver<LineBreak, Object> LineBreakSaver = SaverKt.Saver(new p<SaverScope, LineBreak, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, LineBreak lineBreak) {
            return m4488invokenI23V4A(saverScope, lineBreak.m4890unboximpl());
        }

        /* renamed from: invoke-nI23V4A, reason: not valid java name */
        public final Object m4488invokenI23V4A(SaverScope saverScope, int i11) {
            return Integer.valueOf(i11);
        }
    }, new l<Object, LineBreak>() { // from class: androidx.compose.ui.text.Savers_androidKt$LineBreakSaver$2
        @Override // x00.l
        /* renamed from: invoke-8aCASmQ, reason: not valid java name and merged with bridge method [inline-methods] */
        public final LineBreak invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return LineBreak.m4878boximpl(LineBreak.m4879constructorimpl(((Integer) obj).intValue()));
        }
    });

    @k
    private static final Saver<TextMotion, Object> TextMotionSaver = SaverKt.Saver(new p<SaverScope, TextMotion, Object>() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$1
        @Override // x00.p
        public final Object invoke(SaverScope saverScope, TextMotion textMotion) {
            return h0.t(SaversKt.save(TextMotion.Linearity.m5006boximpl(textMotion.m5005getLinearity4e0Vf04$ui_text_release())), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning$ui_text_release())));
        }
    }, new l<Object, TextMotion>() { // from class: androidx.compose.ui.text.Savers_androidKt$TextMotionSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.l
        public final TextMotion invoke(Object obj) {
            g0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion.Linearity linearity = obj2 != null ? (TextMotion.Linearity) obj2 : null;
            g0.m(linearity);
            int m5012unboximpl = linearity.m5012unboximpl();
            Object obj3 = list.get(1);
            Boolean bool = obj3 != null ? (Boolean) obj3 : null;
            g0.m(bool);
            return new TextMotion(m5012unboximpl, bool.booleanValue(), null);
        }
    });

    @k
    public static final Saver<PlatformParagraphStyle, Object> getSaver(@k PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    @k
    public static final Saver<LineBreak, Object> getSaver(@k LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    @k
    public static final Saver<TextMotion, Object> getSaver(@k TextMotion.Companion companion) {
        return TextMotionSaver;
    }
}
