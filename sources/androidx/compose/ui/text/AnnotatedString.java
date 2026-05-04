package androidx.compose.ui.text;

import a00.h0;
import a00.m0;
import a00.r0;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import e00.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n247#2,6:1634\n34#2,6:1640\n253#2:1646\n102#2,2:1647\n34#2,6:1649\n104#2:1655\n247#2,6:1656\n34#2,6:1662\n253#2:1668\n230#2,3:1669\n34#2,6:1672\n233#2:1678\n230#2,3:1679\n34#2,6:1682\n233#2:1688\n230#2,3:1689\n34#2,6:1692\n233#2:1698\n102#2,2:1699\n34#2,6:1701\n104#2:1707\n1045#3:1614\n366#4:1615\n70#4:1616\n114#5,8:1617\n114#5,8:1626\n1#6:1625\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n121#1:1608,6\n221#1:1634,6\n221#1:1640,6\n221#1:1646\n231#1:1647,2\n231#1:1649,6\n231#1:1655\n246#1:1656,6\n246#1:1662,6\n246#1:1668\n263#1:1669,3\n263#1:1672,6\n263#1:1678\n281#1:1679,3\n281#1:1682,6\n281#1:1688\n297#1:1689,3\n297#1:1692,6\n297#1:1698\n306#1:1699,2\n306#1:1701,6\n306#1:1707\n137#1:1614\n148#1:1615\n151#1:1616\n153#1:1617,8\n177#1:1626,8\n*E\n"})
/* loaded from: classes2.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();

    @l
    private final List<Range<? extends Annotation>> annotations;

    @l
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    @l
    private final List<Range<SpanStyle>> spanStylesOrNull;

    @k
    private final String text;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Annotation {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n150#2,3:1644\n34#2,6:1647\n153#2:1653\n529#2,3:1654\n34#2,4:1657\n532#2:1661\n150#2,3:1662\n34#2,6:1665\n153#2:1671\n533#2,2:1672\n39#2:1674\n535#2:1675\n77#3,8:1620\n77#3,8:1628\n77#3,8:1636\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n540#1:1608,6\n558#1:1614,6\n964#1:1644,3\n964#1:1647,6\n964#1:1653\n981#1:1654,3\n981#1:1657,4\n981#1:1661\n982#1:1662,3\n982#1:1665,6\n982#1:1671\n981#1:1672,2\n981#1:1674\n981#1:1675\n823#1:1620,8\n935#1:1628,8\n952#1:1636,8\n*E\n"})
    public static final class Builder implements Appendable {
        public static final int $stable = 8;

        @k
        private final List<MutableRange<? extends Annotation>> annotations;

        @k
        private final BulletScope bulletScope;

        @k
        private final List<MutableRange<? extends Object>> styleStack;

        @k
        private final StringBuilder text;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @StabilityInferred(parameters = 0)
        public static final class BulletScope {
            public static final int $stable = 8;

            @k
            private final Builder builder;

            @k
            private final List<Pair<TextUnit, Bullet>> bulletListSettingStack = new ArrayList();

            public BulletScope(@k Builder builder) {
                this.builder = builder;
            }

            @k
            public final Builder getBuilder$ui_text_release() {
                return this.builder;
            }

            @k
            public final List<Pair<TextUnit, Bullet>> getBulletListSettingStack$ui_text_release() {
                return this.bulletListSettingStack;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n77#2,8:1608\n77#2,8:1616\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n*L\n417#1:1608,8\n428#1:1616,8\n*E\n"})
        public static final class MutableRange<T> {

            @k
            public static final Companion Companion = new Companion(null);
            private int end;
            private final T item;
            private final int start;

            @k
            private final String tag;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class Companion {
                public /* synthetic */ Companion(v vVar) {
                    this();
                }

                @k
                public final <T> MutableRange<T> fromRange(@k Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }

                private Companion() {
                }
            }

            public MutableRange(T t11, int i11, int i12, @k String str) {
                this.item = t11;
                this.start = i11;
                this.end = i12;
                this.tag = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i11, int i12, String str, int i13, Object obj2) {
                if ((i13 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i13 & 2) != 0) {
                    i11 = mutableRange.start;
                }
                if ((i13 & 4) != 0) {
                    i12 = mutableRange.end;
                }
                if ((i13 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i11, i12, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i11);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            @k
            public final String component4() {
                return this.tag;
            }

            @k
            public final MutableRange<T> copy(T t11, int i11, int i12, @k String str) {
                return new MutableRange<>(t11, i11, i12, str);
            }

            public boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return g0.g(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && g0.g(this.tag, mutableRange.tag);
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            @k
            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                T t11 = this.item;
                return ((((((t11 == null ? 0 : t11.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i11) {
                this.end = i11;
            }

            @k
            public final Range<T> toRange(int i11) {
                int i12 = this.end;
                if (i12 != Integer.MIN_VALUE) {
                    i11 = i12;
                }
                if (!(i11 != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, i11, this.tag);
            }

            @k
            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, x00.l lVar, int i11, int i12, Object obj) {
                if ((i12 & 2) != 0) {
                    i11 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(lVar, i11);
            }

            @k
            public final <R> Range<R> toRange(@k x00.l<? super T, ? extends R> lVar, int i11) {
                int i12 = this.end;
                if (i12 != Integer.MIN_VALUE) {
                    i11 = i12;
                }
                if (!(i11 != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(lVar.invoke(this.item), this.start, i11, this.tag);
            }

            public /* synthetic */ MutableRange(Object obj, int i11, int i12, String str, int i13, v vVar) {
                this(obj, i11, (i13 & 4) != 0 ? Integer.MIN_VALUE : i12, (i13 & 8) != 0 ? "" : str);
            }
        }

        public Builder() {
            this(0, 1, null);
        }

        /* renamed from: withBulletList-o2QH7mI$ui_text_release$default, reason: not valid java name */
        public static /* synthetic */ Object m4389withBulletListo2QH7mI$ui_text_release$default(Builder builder, long j11, Bullet bullet, x00.l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = BulletKt.getDefaultBulletIndentation();
            }
            if ((i11 & 2) != 0) {
                bullet = BulletKt.getDefaultBullet();
            }
            return builder.m4391withBulletListo2QH7mI$ui_text_release(j11, bullet, lVar);
        }

        public final void addBullet$ui_text_release(@k Bullet bullet, int i11, int i12) {
            this.annotations.add(new MutableRange<>(bullet, i11, i12, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: addBullet-r9BaKPg$ui_text_release, reason: not valid java name */
        public final void m4390addBulletr9BaKPg$ui_text_release(@k Bullet bullet, long j11, int i11, int i12) {
            Object[] objArr = 0 == true ? 1 : 0;
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(j11, j11, null), (PlatformParagraphStyle) objArr, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (v) null), i11, i12, null, 8, 0 == true ? 1 : 0));
            this.annotations.add(new MutableRange<>(bullet, i11, i12, 0 == true ? 1 : 0, 8, null));
        }

        public final void addLink(@k LinkAnnotation.Url url, int i11, int i12) {
            this.annotations.add(new MutableRange<>(url, i11, i12, null, 8, null));
        }

        public final void addStringAnnotation(@k String str, @k String str2, int i11, int i12) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m4507boximpl(StringAnnotation.m4508constructorimpl(str2)), i11, i12, str));
        }

        public final void addStyle(@k SpanStyle spanStyle, int i11, int i12) {
            this.annotations.add(new MutableRange<>(spanStyle, i11, i12, null, 8, null));
        }

        public final void addTtsAnnotation(@k TtsAnnotation ttsAnnotation, int i11, int i12) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, i11, i12, null, 8, null));
        }

        @ExperimentalTextApi
        @n(message = "Use LinkAnnotation API for links instead", replaceWith = @w0(expression = "addLink(, start, end)", imports = {}))
        public final void addUrlAnnotation(@k UrlAnnotation urlAnnotation, int i11, int i12) {
            this.annotations.add(new MutableRange<>(urlAnnotation, i11, i12, null, 8, null));
        }

        public final void flatMapAnnotations$ui_text_release(@k x00.l<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> lVar) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                List<? extends Range<? extends Annotation>> invoke = lVar.invoke(MutableRange.toRange$default(list.get(i11), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(invoke.size());
                int size2 = invoke.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    arrayList2.add(MutableRange.Companion.fromRange(invoke.get(i12)));
                }
                m0.s0(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void mapAnnotations$ui_text_release(@k x00.l<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> lVar) {
            int size = this.annotations.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.annotations.set(i11, MutableRange.Companion.fromRange(lVar.invoke(MutableRange.toRange$default(this.annotations.get(i11), 0, 1, null))));
            }
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
        }

        public final int pushBullet$ui_text_release(@k Bullet bullet) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(@k LinkAnnotation linkAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(linkAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(@k String str, @k String str2) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m4507boximpl(StringAnnotation.m4508constructorimpl(str2)), this.text.length(), 0, str, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(@k SpanStyle spanStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(@k TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @ExperimentalTextApi
        @n(message = "Use LinkAnnotation API for links instead", replaceWith = @w0(expression = "pushLink(, start, end)", imports = {}))
        public final int pushUrlAnnotation(@k UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @k
        public final AnnotatedString toAnnotatedString() {
            String sb2 = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).toRange(this.text.length()));
            }
            return new AnnotatedString(sb2, arrayList);
        }

        @k
        /* renamed from: withBulletList-o2QH7mI$ui_text_release, reason: not valid java name */
        public final <R> R m4391withBulletListo2QH7mI$ui_text_release(long j11, @k Bullet bullet, @k x00.l<? super BulletScope, ? extends R> lVar) {
            long j12;
            Pair pair = (Pair) r0.A3(this.bulletScope.getBulletListSettingStack$ui_text_release());
            if (pair != null) {
                long m5318unboximpl = ((TextUnit) pair.getFirst()).m5318unboximpl();
                if (!TextUnitType.m5337equalsimpl0(TextUnit.m5308getTypeUIouoOA(m5318unboximpl), TextUnit.m5308getTypeUIouoOA(j11))) {
                    InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + ((Object) TextUnit.m5316toStringimpl(m5318unboximpl)) + " and previous is " + ((Object) TextUnit.m5316toStringimpl(j11)));
                }
                long m5308getTypeUIouoOA = TextUnit.m5308getTypeUIouoOA(j11);
                TextUnitType.Companion companion = TextUnitType.Companion;
                j12 = TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5342getSpUIouoOA()) ? TextUnitKt.getSp(TextUnit.m5309getValueimpl(j11) + TextUnit.m5309getValueimpl(m5318unboximpl)) : TextUnitType.m5337equalsimpl0(m5308getTypeUIouoOA, companion.m5341getEmUIouoOA()) ? TextUnitKt.getEm(TextUnit.m5309getValueimpl(j11) + TextUnit.m5309getValueimpl(m5318unboximpl)) : j11;
            } else {
                j12 = j11;
            }
            int pushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(j12, j12, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (v) null));
            this.bulletScope.getBulletListSettingStack$ui_text_release().add(new Pair<>(TextUnit.m5299boximpl(j12), bullet));
            try {
                return lVar.invoke(this.bulletScope);
            } finally {
                if (!this.bulletScope.getBulletListSettingStack$ui_text_release().isEmpty()) {
                    this.bulletScope.getBulletListSettingStack$ui_text_release().remove(h0.L(this.bulletScope.getBulletListSettingStack$ui_text_release()));
                }
                pop(pushStyle);
            }
        }

        public Builder(int i11) {
            this.text = new StringBuilder(i11);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public final void addLink(@k LinkAnnotation.Clickable clickable, int i11, int i12) {
            this.annotations.add(new MutableRange<>(clickable, i11, i12, null, 8, null));
        }

        public final void addStyle(@k ParagraphStyle paragraphStyle, int i11, int i12) {
            this.annotations.add(new MutableRange<>(paragraphStyle, i11, i12, null, 8, null));
        }

        public final void append(@k String str) {
            this.text.append(str);
        }

        public final void pop(int i11) {
            if (!(i11 < this.styleStack.size())) {
                InlineClassHelperKt.throwIllegalStateException(i11 + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= i11) {
                pop();
            }
        }

        public final int pushStyle(@k ParagraphStyle paragraphStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(paragraphStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Override // java.lang.Appendable
        @k
        public Builder append(@l CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
                return this;
            }
            this.text.append(charSequence);
            return this;
        }

        public /* synthetic */ Builder(int i11, int i12, v vVar) {
            this((i12 & 1) != 0 ? 16 : i11);
        }

        public Builder(@k String str) {
            this(0, 1, null);
            append(str);
        }

        @Override // java.lang.Appendable
        @k
        public Builder append(@l CharSequence charSequence, int i11, int i12) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i11, i12);
                return this;
            }
            this.text.append(charSequence, i11, i12);
            return this;
        }

        public Builder(@k AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        @Override // java.lang.Appendable
        @k
        public Builder append(char c11) {
            this.text.append(c11);
            return this;
        }

        public final void append(@k AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<? extends Annotation>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size = annotations$ui_text_release.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Range<? extends Annotation> range = annotations$ui_text_release.get(i11);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void append(@k AnnotatedString annotatedString, int i11, int i12) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i11, i12);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(annotatedString, i11, i12, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Range range = (Range) localAnnotations$default.get(i13);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(@l List<? extends Range<? extends Annotation>> list, @k String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                Range<SpanStyle> range = (Range) list.get(i11);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    g0.n(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    g0.n(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List z52 = arrayList2 != null ? r0.z5(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(Integer.valueOf(((AnnotatedString.Range) t11).getStart()), Integer.valueOf(((AnnotatedString.Range) t12).getStart()));
            }
        }) : null;
        List list2 = z52;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        MutableIntList mutableIntListOf = IntListKt.mutableIntListOf(((Range) r0.G2(z52)).getEnd());
        int size2 = z52.size();
        for (int i12 = 1; i12 < size2; i12++) {
            Range range2 = (Range) z52.get(i12);
            while (true) {
                if (mutableIntListOf._size == 0) {
                    break;
                }
                int last = mutableIntListOf.last();
                if (range2.getStart() >= last) {
                    mutableIntListOf.removeAt(mutableIntListOf._size - 1);
                } else if (!(range2.getEnd() <= last)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + last);
                }
            }
            mutableIntListOf.add(range2.getEnd());
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return get(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return g0.g(this.text, annotatedString.text) && g0.g(this.annotations, annotatedString.annotations);
    }

    @k
    public final AnnotatedString flatMapAnnotations(@k x00.l<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> lVar) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text_release(lVar);
        return builder.toAnnotatedString();
    }

    public char get(int i11) {
        return this.text.charAt(i11);
    }

    @l
    public final List<Range<? extends Annotation>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    @k
    public final List<Range<LinkAnnotation>> getLinkAnnotations(int i11, int i12) {
        List J;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            J = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Range<? extends Annotation> range = list.get(i13);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i11, i12, range2.getStart(), range2.getEnd())) {
                    J.add(range);
                }
            }
        } else {
            J = h0.J();
        }
        g0.n(J, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return J;
    }

    @k
    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? h0.J() : list;
    }

    @l
    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    @k
    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? h0.J() : list;
    }

    @l
    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    @k
    public final List<Range<String>> getStringAnnotations(@k String str, int i11, int i12) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return h0.J();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Range<? extends Annotation> range = list.get(i13);
            if ((range.getItem() instanceof StringAnnotation) && g0.g(str, range.getTag()) && AnnotatedStringKt.intersect(i11, i12, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @k
    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i11, int i12) {
        List J;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            J = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Range<? extends Annotation> range = list.get(i13);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i11, i12, range2.getStart(), range2.getEnd())) {
                    J.add(range);
                }
            }
        } else {
            J = h0.J();
        }
        g0.n(J, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return J;
    }

    @ExperimentalTextApi
    @n(message = "Use LinkAnnotation API instead", replaceWith = @w0(expression = "getLinkAnnotations(start, end)", imports = {}))
    @k
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i11, int i12) {
        List J;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            J = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Range<? extends Annotation> range = list.get(i13);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i11, i12, range2.getStart(), range2.getEnd())) {
                    J.add(range);
                }
            }
        } else {
            J = h0.J();
        }
        g0.n(J, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return J;
    }

    public final boolean hasEqualAnnotations(@k AnnotatedString annotatedString) {
        return g0.g(this.annotations, annotatedString.annotations);
    }

    public final boolean hasLinkAnnotations(int i11, int i12) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Range<? extends Annotation> range = list.get(i13);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i11, i12, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(@k String str, int i11, int i12) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Range<? extends Annotation> range = list.get(i13);
                if ((range.getItem() instanceof StringAnnotation) && g0.g(str, range.getTag()) && AnnotatedStringKt.intersect(i11, i12, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        List<Range<? extends Annotation>> list = this.annotations;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @k
    public final AnnotatedString mapAnnotations(@k x00.l<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> lVar) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text_release(lVar);
        return builder.toAnnotatedString();
    }

    @Stable
    @k
    public final AnnotatedString plus(@k AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    @k
    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m4388subSequence5zctL8(long j11) {
        return subSequence(TextRange.m4557getMinimpl(j11), TextRange.m4556getMaximpl(j11));
    }

    @Override // java.lang.CharSequence
    @k
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    @k
    public AnnotatedString subSequence(int i11, int i12) {
        List filterRanges;
        if (!(i11 <= i12)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i11 + ") should be less or equal to end (" + i12 + ')');
        }
        if (i11 == 0 && i12 == this.text.length()) {
            return this;
        }
        String substring = this.text.substring(i11, i12);
        g0.o(substring, "substring(...)");
        filterRanges = AnnotatedStringKt.filterRanges(this.annotations, i11, i12);
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) filterRanges, substring);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n114#2,8:1608\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n*L\n386#1:1608,8\n*E\n"})
    @Immutable
    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;

        @k
        private final String tag;

        public Range(T t11, int i11, int i12, @k String str) {
            this.item = t11;
            this.start = i11;
            this.end = i12;
            this.tag = str;
            if (i11 <= i12) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i11, int i12, String str, int i13, Object obj2) {
            if ((i13 & 1) != 0) {
                obj = range.item;
            }
            if ((i13 & 2) != 0) {
                i11 = range.start;
            }
            if ((i13 & 4) != 0) {
                i12 = range.end;
            }
            if ((i13 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i11, i12, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        @k
        public final String component4() {
            return this.tag;
        }

        @k
        public final Range<T> copy(T t11, int i11, int i12, @k String str) {
            return new Range<>(t11, i11, i12, str);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return g0.g(this.item, range.item) && this.start == range.start && this.end == range.end && g0.g(this.tag, range.tag);
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        @k
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t11 = this.item;
            return ((((((t11 == null ? 0 : t11.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        @k
        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t11, int i11, int i12) {
            this(t11, i11, i12, "");
        }
    }

    @k
    public final List<Range<String>> getStringAnnotations(int i11, int i12) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                Range<? extends Annotation> range = list.get(i13);
                if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(i11, i12, range.getStart(), range.getEnd())) {
                    arrayList.add(StringAnnotationKt.unbox(range));
                }
            }
            return arrayList;
        }
        return h0.J();
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? h0.J() : list, (i11 & 4) != 0 ? h0.J() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnnotatedString(@m80.k java.lang.String r1, @m80.k java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>> r2, @m80.k java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>> r3) {
        /*
            r0 = this;
            java.util.List r2 = androidx.compose.ui.text.AnnotatedStringKt.access$constructAnnotationsFromSpansAndParagraphs(r2, r3)
            r0.<init>(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List):void");
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i11, v vVar) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i11 & 2) != 0 ? h0.J() : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnnotatedString(@m80.k java.lang.String r2, @m80.k java.util.List<? extends androidx.compose.ui.text.AnnotatedString.Range<? extends androidx.compose.ui.text.AnnotatedString.Annotation>> r3) {
        /*
            r1 = this;
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            r3 = 0
        L9:
            java.util.List r3 = (java.util.List) r3
            r1.<init>(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.<init>(java.lang.String, java.util.List):void");
    }
}
