package androidx.compose.foundation.internal;

import a00.h0;
import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.badlogic.gdx.math.n;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,556:1\n30#2:557\n53#3,3:558\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n*L\n450#1:557\n450#1:558,3\n*E\n"})
/* loaded from: classes.dex */
public final class DecodeHelper {
    public static final int $stable = 8;

    @k
    private final Parcel parcel;

    public DecodeHelper(@k String str) {
        Parcel obtain = Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m549decodeBaselineShifty9eOQZs() {
        return BaselineShift.m4850constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        long m551decodeColor0d7_KjU = m551decodeColor0d7_KjU();
        float decodeFloat = decodeFloat();
        float decodeFloat2 = decodeFloat();
        return new Shadow(m551decodeColor0d7_KjU, Offset.m2260constructorimpl((Float.floatToRawIntBits(decodeFloat2) & 4294967295L) | (Float.floatToRawIntBits(decodeFloat) << 32)), decodeFloat(), null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        int decodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        boolean z11 = (companion.getLineThrough().getMask() & decodeInt) != 0;
        boolean z12 = (decodeInt & companion.getUnderline().getMask()) != 0;
        return (z11 && z12) ? companion.combine(h0.Q(companion.getLineThrough(), companion.getUnderline())) : z11 ? companion.getLineThrough() : z12 ? companion.getUnderline() : companion.getNone();
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m550decodeULongsVKNKU() {
        return w1.i(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m551decodeColor0d7_KjU() {
        return Color.m2505constructorimpl(m550decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m552decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        return decodeByte == 0 ? FontStyle.Companion.m4677getNormal_LCdwA() : decodeByte == 1 ? FontStyle.Companion.m4676getItalic_LCdwA() : FontStyle.Companion.m4677getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m553decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        return decodeByte == 0 ? FontSynthesis.Companion.m4688getNoneGVVA2EU() : decodeByte == 1 ? FontSynthesis.Companion.m4687getAllGVVA2EU() : decodeByte == 3 ? FontSynthesis.Companion.m4689getStyleGVVA2EU() : decodeByte == 2 ? FontSynthesis.Companion.m4690getWeightGVVA2EU() : FontSynthesis.Companion.m4688getNoneGVVA2EU();
    }

    @k
    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    @k
    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, n.f12683h, null);
        while (this.parcel.dataAvail() > 1) {
            byte decodeByte = decodeByte();
            if (decodeByte != 1) {
                if (decodeByte != 2) {
                    if (decodeByte != 3) {
                        if (decodeByte != 4) {
                            if (decodeByte != 5) {
                                if (decodeByte != 6) {
                                    if (decodeByte != 7) {
                                        if (decodeByte != 8) {
                                            if (decodeByte != 9) {
                                                if (decodeByte != 10) {
                                                    if (decodeByte != 11) {
                                                        if (decodeByte == 12) {
                                                            if (dataAvailable() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.setShadow(decodeShadow());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (dataAvailable() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                                    }
                                                } else {
                                                    if (dataAvailable() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.m568setBackground8_81llA(m551decodeColor0d7_KjU());
                                                }
                                            } else {
                                                if (dataAvailable() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.m569setBaselineShift_isdbwI(BaselineShift.m4849boximpl(m549decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m574setLetterSpacingR2X_6o(m554decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m573setFontSynthesistDdu0R4(FontSynthesis.m4678boximpl(m553decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m572setFontStylemLjRB2g(FontStyle.m4667boximpl(m552decodeFontStyle_LCdwA()));
                        }
                    } else {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                    }
                } else {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m571setFontSizeR2X_6o(m554decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m570setColor8_81llA(m551decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m554decodeTextUnitXSAIIZE() {
        byte decodeByte = decodeByte();
        long m5342getSpUIouoOA = decodeByte == 1 ? TextUnitType.Companion.m5342getSpUIouoOA() : decodeByte == 2 ? TextUnitType.Companion.m5341getEmUIouoOA() : TextUnitType.Companion.m5343getUnspecifiedUIouoOA();
        return TextUnitType.m5337equalsimpl0(m5342getSpUIouoOA, TextUnitType.Companion.m5343getUnspecifiedUIouoOA()) ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : TextUnitKt.m5321TextUnitanM5pPY(decodeFloat(), m5342getSpUIouoOA);
    }
}
