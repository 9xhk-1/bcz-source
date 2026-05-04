package bt;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f7225b = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7227d = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7229f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7230g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7231h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f7232i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f7233j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f7234k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f7235l = 6;

    /* renamed from: m, reason: collision with root package name */
    public static final int f7236m = 7;

    /* renamed from: n, reason: collision with root package name */
    public static final int f7237n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f7238o = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7224a = {R.attr.ordering};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f7226c = {R.attr.propertyName};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f7228e = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    public static a a(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return b(context, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r10.hasNext() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r9[r6] = (bt.a) r10.next();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r13 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r12.G(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r12.E(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r12 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r9 = new bt.a[r2.size()];
        r10 = r2.iterator();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bt.a b(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, bt.d r12, int r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r10.next()
            r5 = 3
            r6 = 0
            if (r4 != r5) goto L15
            int r5 = r10.getDepth()
            if (r5 <= r0) goto L18
        L15:
            r5 = 1
            if (r4 != r5) goto L43
        L18:
            if (r12 == 0) goto L42
            if (r2 == 0) goto L42
            int r9 = r2.size()
            bt.a[] r9 = new bt.a[r9]
            java.util.Iterator r10 = r2.iterator()
        L26:
            boolean r11 = r10.hasNext()
            if (r11 != 0) goto L36
            if (r13 != 0) goto L32
            r12.G(r9)
            return r3
        L32:
            r12.E(r9)
            return r3
        L36:
            java.lang.Object r11 = r10.next()
            bt.a r11 = (bt.a) r11
            int r0 = r6 + 1
            r9[r6] = r11
            r6 = r0
            goto L26
        L42:
            return r3
        L43:
            r5 = 2
            if (r4 == r5) goto L47
            goto L7
        L47:
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = "objectAnimator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L58
            bt.l r3 = e(r9, r11)
            goto L8e
        L58:
            java.lang.String r4 = "animator"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L65
            bt.q r3 = d(r9, r11, r1)
            goto L8e
        L65:
            java.lang.String r4 = "set"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L9c
            bt.d r3 = new bt.d
            r3.<init>()
            int[] r4 = bt.b.f7224a
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r11, r4)
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.getValue(r6, r5)
            int r7 = r5.type
            r8 = 16
            if (r7 != r8) goto L88
            int r6 = r5.data
        L88:
            b(r9, r10, r11, r3, r6)
            r4.recycle()
        L8e:
            if (r12 == 0) goto L7
            if (r2 != 0) goto L97
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L97:
            r2.add(r3)
            goto L7
        L9c:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unknown animator name: "
            r11.<init>(r12)
            java.lang.String r10 = r10.getName()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bt.b.b(android.content.Context, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, bt.d, int):bt.a");
    }

    public static a c(Context context, int i11) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = context.getResources().getAnimation(i11);
                return a(context, xmlResourceParser);
            } catch (IOException e11) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                notFoundException.initCause(e11);
                throw notFoundException;
            } catch (XmlPullParserException e12) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                notFoundException2.initCause(e12);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static q d(Context context, AttributeSet attributeSet, q qVar) throws Resources.NotFoundException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7228e);
        long j11 = obtainStyledAttributes.getInt(1, 0);
        long j12 = obtainStyledAttributes.getInt(2, 0);
        int i17 = obtainStyledAttributes.getInt(7, 0);
        q qVar2 = qVar == null ? new q() : qVar;
        int i18 = i17 == 0 ? 1 : 0;
        TypedValue peekValue = obtainStyledAttributes.peekValue(5);
        boolean z11 = peekValue != null;
        int i19 = z11 ? peekValue.type : 0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        boolean z12 = peekValue2 != null;
        if (z12) {
            i12 = peekValue2.type;
            i11 = 0;
        } else {
            i11 = 0;
            i12 = 0;
        }
        if ((z11 && i19 >= 28 && i19 <= 31) || (z12 && i12 >= 28 && i12 <= 31)) {
            qVar2.q0(new e());
            i18 = i11;
        }
        if (i18 != 0) {
            if (z11) {
                float dimension = i19 == 5 ? obtainStyledAttributes.getDimension(5, 0.0f) : obtainStyledAttributes.getFloat(5, 0.0f);
                if (z12) {
                    float dimension2 = i12 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f);
                    float[] fArr = new float[2];
                    fArr[i11] = dimension;
                    fArr[1] = dimension2;
                    qVar2.r0(fArr);
                } else {
                    float[] fArr2 = new float[1];
                    fArr2[i11] = dimension;
                    qVar2.r0(fArr2);
                }
            } else {
                float[] fArr3 = new float[1];
                fArr3[i11] = i12 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f);
                qVar2.r0(fArr3);
            }
            i13 = i11;
        } else {
            if (z11) {
                if (i19 == 5) {
                    i16 = (int) obtainStyledAttributes.getDimension(5, 0.0f);
                    i15 = i11;
                } else if (i19 < 28 || i19 > 31) {
                    i15 = i11;
                    i16 = obtainStyledAttributes.getInt(5, i15);
                } else {
                    i15 = i11;
                    i16 = obtainStyledAttributes.getColor(5, i15);
                }
                if (z12) {
                    qVar2.t0(i16, i12 == 5 ? (int) obtainStyledAttributes.getDimension(6, 0.0f) : (i12 < 28 || i12 > 31) ? obtainStyledAttributes.getInt(6, i15) : obtainStyledAttributes.getColor(6, i15));
                } else {
                    qVar2.t0(i16);
                }
            } else if (z12) {
                if (i12 == 5) {
                    i14 = (int) obtainStyledAttributes.getDimension(6, 0.0f);
                    i13 = 0;
                } else if (i12 < 28 || i12 > 31) {
                    i13 = 0;
                    i14 = obtainStyledAttributes.getInt(6, 0);
                } else {
                    i13 = 0;
                    i14 = obtainStyledAttributes.getColor(6, 0);
                }
                qVar2.t0(i14);
            }
            i13 = 0;
        }
        qVar2.l(j11);
        qVar2.n(j12);
        if (obtainStyledAttributes.hasValue(3)) {
            qVar2.v0(obtainStyledAttributes.getInt(3, i13));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            qVar2.x0(obtainStyledAttributes.getInt(4, 1));
        }
        int resourceId = obtainStyledAttributes.getResourceId(i13, i13);
        if (resourceId > 0) {
            qVar2.m(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
        return qVar2;
    }

    public static l e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        l lVar = new l();
        d(context, attributeSet, lVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7226c);
        lVar.V0(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        return lVar;
    }
}
