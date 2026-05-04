package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kc.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DesignElement {
        String mId;
        HashMap<String, String> mParams;
        String mType;

        public DesignElement(String str, String str2, HashMap<String, String> hashMap) {
            this.mId = str;
            this.mType = str2;
            this.mParams = hashMap;
        }

        public String getId() {
            return this.mId;
        }

        public HashMap<String, String> getParams() {
            return this.mParams;
        }

        public String getType() {
            return this.mType;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FiniteGenerator implements GeneratedValue {
        float mFrom;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep;
        float mTo;
        boolean mStop = false;
        float mCurrent = 0.0f;

        public FiniteGenerator(float f11, float f12, float f13, String str, String str2) {
            this.mFrom = f11;
            this.mTo = f12;
            this.mStep = f13;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f12;
            this.mInitial = f11;
        }

        public ArrayList<String> array() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i11 = (int) this.mInitial;
            int i12 = (int) this.mMax;
            int i13 = i11;
            while (i11 <= i12) {
                arrayList.add(this.mPrefix + i13 + this.mPostfix);
                i13 += (int) this.mStep;
                i11++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            float f11 = this.mCurrent;
            if (f11 >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent = f11 + this.mStep;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface GeneratedValue {
        float value();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Generator implements GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop = false;

        public Generator(float f11, float f12) {
            this.mStart = f11;
            this.mIncrementBy = f12;
            this.mCurrent = f11;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LayoutVariables {
        HashMap<String, Integer> mMargins = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        public float get(Object obj) {
            if (!(obj instanceof CLString)) {
                if (obj instanceof CLNumber) {
                    return ((CLNumber) obj).getFloat();
                }
                return 0.0f;
            }
            String content = ((CLString) obj).content();
            if (this.mGenerators.containsKey(content)) {
                return this.mGenerators.get(content).value();
            }
            if (this.mMargins.containsKey(content)) {
                return this.mMargins.get(content).floatValue();
            }
            return 0.0f;
        }

        public ArrayList<String> getList(String str) {
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        public void put(String str, int i11) {
            this.mMargins.put(str, Integer.valueOf(i11));
        }

        public void putOverride(String str, float f11) {
            this.mGenerators.put(str, new OverrideValue(f11));
        }

        public void put(String str, float f11, float f12) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            this.mGenerators.put(str, new Generator(f11, f12));
        }

        public void put(String str, float f11, float f12, float f13, String str2, String str3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            FiniteGenerator finiteGenerator = new FiniteGenerator(f11, f12, f13, str2, str3);
            this.mGenerators.put(str, finiteGenerator);
            this.mArrayIds.put(str, finiteGenerator.array());
        }

        public void put(String str, ArrayList<String> arrayList) {
            this.mArrayIds.put(str, arrayList);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OverrideValue implements GeneratedValue {
        float mValue;

        public OverrideValue(float f11) {
            this.mValue = f11;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            return this.mValue;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0168, code lost:
    
        if (r8.equals("visible") == false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void applyAttribute(androidx.constraintlayout.core.state.State r8, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r9, androidx.constraintlayout.core.state.ConstraintReference r10, androidx.constraintlayout.core.parser.CLObject r11, java.lang.String r12) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.applyAttribute(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.parser.CLObject, java.lang.String):void");
    }

    private static int indexOf(String str, String... strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11].equals(str)) {
                return i11;
            }
        }
        return -1;
    }

    public static String lookForType(CLObject cLObject) throws CLParsingException {
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }

    public static void override(CLObject cLObject, String str, CLObject cLObject2) throws CLParsingException {
        if (!cLObject.has(str)) {
            cLObject.put(str, cLObject2);
            return;
        }
        CLObject object = cLObject.getObject(str);
        Iterator<String> it = cLObject2.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(o.N)) {
                CLArray array = cLObject2.getArray(o.N);
                for (int i11 = 0; i11 < array.size(); i11++) {
                    String stringOrNull = array.getStringOrNull(i11);
                    if (stringOrNull != null) {
                        switch (stringOrNull) {
                            case "transforms":
                                object.remove("visibility");
                                object.remove("alpha");
                                object.remove("pivotX");
                                object.remove("pivotY");
                                object.remove("rotationX");
                                object.remove("rotationY");
                                object.remove("rotationZ");
                                object.remove("scaleX");
                                object.remove("scaleY");
                                object.remove("translationX");
                                object.remove("translationY");
                                break;
                            case "constraints":
                                object.remove(TtmlNode.START);
                                object.remove(TtmlNode.END);
                                object.remove("top");
                                object.remove("bottom");
                                object.remove("baseline");
                                object.remove(TtmlNode.CENTER);
                                object.remove("centerHorizontally");
                                object.remove("centerVertically");
                                break;
                            case "dimensions":
                                object.remove("width");
                                object.remove("height");
                                break;
                            default:
                                object.remove(stringOrNull);
                                break;
                        }
                    }
                }
            } else {
                object.put(next, cLObject2.get(next));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
    
        if (r2.equals("top") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void parseBarrier(androidx.constraintlayout.core.state.State r8, java.lang.String r9, androidx.constraintlayout.core.parser.CLObject r10) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseBarrier(androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void parseChain(int r6, androidx.constraintlayout.core.state.State r7, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r8, androidx.constraintlayout.core.parser.CLArray r9) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            if (r6 != 0) goto L7
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r6 = r7.horizontalChain()
            goto Lb
        L7:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r6 = r7.verticalChain()
        Lb:
            r0 = 1
            androidx.constraintlayout.core.parser.CLElement r1 = r9.get(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r2 == 0) goto Laf
            androidx.constraintlayout.core.parser.CLArray r1 = (androidx.constraintlayout.core.parser.CLArray) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L1e
            goto Laf
        L1e:
            r2 = 0
            r3 = r2
        L20:
            int r4 = r1.size()
            if (r3 >= r4) goto L34
            java.lang.String r4 = r1.getString(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.add(r4)
            int r3 = r3 + 1
            goto L20
        L34:
            int r1 = r9.size()
            r3 = 2
            if (r1 <= r3) goto Laf
            androidx.constraintlayout.core.parser.CLElement r9 = r9.get(r3)
            boolean r1 = r9 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 != 0) goto L44
            goto Laf
        L44:
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            java.util.ArrayList r1 = r9.names()
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L69
            parseConstraint(r7, r8, r9, r6, r3)
            goto L4e
        L69:
            androidx.constraintlayout.core.parser.CLElement r3 = r9.get(r3)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L86
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r5 = r4.size()
            if (r5 <= r0) goto L86
            java.lang.String r3 = r4.getString(r2)
            float r4 = r4.getFloat(r0)
            r6.bias(r4)
            goto L8a
        L86:
            java.lang.String r3 = r3.content()
        L8a:
            r3.getClass()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La3
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r6.style(r3)
            goto L4e
        La3:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r6.style(r3)
            goto L4e
        La9:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r6.style(r3)
            goto L4e
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChain(int, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseChainType(java.lang.String r18, androidx.constraintlayout.core.state.State r19, java.lang.String r20, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r21, androidx.constraintlayout.core.parser.CLObject r22) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChainType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    public static long parseColorString(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String substring = str.substring(1);
        if (substring.length() == 6) {
            substring = "FF" + substring;
        }
        return Long.parseLong(substring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x00d0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public static void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ConstraintReference constraints;
        char c11;
        boolean z11;
        char c12;
        boolean z12;
        boolean z13;
        ?? r16;
        boolean z14;
        boolean isRtl = state.isRtl();
        boolean z15 = !isRtl;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull == null || arrayOrNull.size() <= 1) {
            String stringOrNull = cLObject.getStringOrNull(str);
            if (stringOrNull != null) {
                constraints = stringOrNull.equals(q.a.f13044u) ? state.constraints(State.PARENT) : state.constraints(stringOrNull);
                str.getClass();
                switch (str) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraints.getKey());
                        constraintReference.baselineToBaseline(constraints);
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraints);
                        break;
                    case "end":
                        if (!isRtl) {
                            constraintReference.rightToRight(constraints);
                            break;
                        } else {
                            constraintReference.leftToLeft(constraints);
                            break;
                        }
                    case "top":
                        constraintReference.topToTop(constraints);
                        break;
                    case "start":
                        if (!isRtl) {
                            constraintReference.leftToLeft(constraints);
                            break;
                        } else {
                            constraintReference.rightToRight(constraints);
                            break;
                        }
                }
            }
            return;
        }
        String string = arrayOrNull.getString(0);
        String stringOrNull2 = arrayOrNull.getStringOrNull(1);
        float pix = arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f;
        float pix2 = arrayOrNull.size() > 3 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(3))) : 0.0f;
        ConstraintReference constraints2 = string.equals(q.a.f13044u) ? state.constraints(State.PARENT) : state.constraints(string);
        str.getClass();
        float f11 = pix;
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 115029:
                if (str.equals("top")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 109757538:
                if (str.equals(TtmlNode.START)) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                z11 = true;
                c12 = 2;
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraints2.getKey());
                        constraintReference.baselineToBaseline(constraints2);
                        break;
                    case "bottom":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToBottom(constraints2);
                        break;
                    case "top":
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToTop(constraints2);
                        break;
                }
                z12 = z11;
                z13 = false;
                break;
            case 1:
                z11 = true;
                c12 = 2;
                constraintReference.circularConstraint(constraints2, layoutVariables.get(arrayOrNull.get(1)), arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f);
                z12 = z11;
                z13 = false;
                break;
            case 2:
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraints2.getKey());
                        constraintReference.bottomToBaseline(constraints2);
                        break;
                    case "bottom":
                        constraintReference.bottomToBottom(constraints2);
                        break;
                    case "top":
                        constraintReference.bottomToTop(constraints2);
                        break;
                }
                z11 = true;
                c12 = 2;
                z12 = z11;
                z13 = false;
                break;
            case 3:
                z12 = isRtl;
                z11 = true;
                c12 = 2;
                z13 = true;
                break;
            case 4:
                stringOrNull2.getClass();
                switch (stringOrNull2) {
                    case "baseline":
                        state.baselineNeededFor(constraints2.getKey());
                        constraintReference.topToBaseline(constraints2);
                        break;
                    case "bottom":
                        constraintReference.topToBottom(constraints2);
                        break;
                    case "top":
                        constraintReference.topToTop(constraints2);
                        break;
                }
                z11 = true;
                c12 = 2;
                z12 = z11;
                z13 = false;
                break;
            case 5:
                z12 = true;
                z11 = true;
                c12 = 2;
                z13 = true;
                break;
            case 6:
                z12 = false;
                z11 = true;
                c12 = 2;
                z13 = true;
                break;
            case 7:
                z12 = z15;
                z11 = true;
                c12 = 2;
                z13 = true;
                break;
            default:
                z11 = true;
                c12 = 2;
                z12 = z11;
                z13 = false;
                break;
        }
        if (z13) {
            stringOrNull2.getClass();
            switch (stringOrNull2.hashCode()) {
                case 100571:
                    if (stringOrNull2.equals(TtmlNode.END)) {
                        r16 = 0;
                        break;
                    }
                    r16 = -1;
                    break;
                case 3317767:
                    if (stringOrNull2.equals(TtmlNode.LEFT)) {
                        r16 = z11;
                        break;
                    }
                    r16 = -1;
                    break;
                case 108511772:
                    if (stringOrNull2.equals(TtmlNode.RIGHT)) {
                        r16 = c12;
                        break;
                    }
                    r16 = -1;
                    break;
                case 109757538:
                    if (stringOrNull2.equals(TtmlNode.START)) {
                        r16 = 3;
                        break;
                    }
                    r16 = -1;
                    break;
                default:
                    r16 = -1;
                    break;
            }
            switch (r16) {
                case 0:
                    z14 = isRtl;
                    break;
                case 1:
                default:
                    z14 = z11;
                    break;
                case 2:
                    z14 = false;
                    break;
                case 3:
                    z14 = z15;
                    break;
            }
            if (z12) {
                if (z14) {
                    constraintReference.leftToLeft(constraints2);
                } else {
                    constraintReference.leftToRight(constraints2);
                }
            } else if (z14) {
                constraintReference.rightToLeft(constraints2);
            } else {
                constraintReference.rightToRight(constraints2);
            }
        }
        constraintReference.margin(Float.valueOf(f11)).marginGone(Float.valueOf(pix2));
    }

    public static void parseConstraintSets(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLObject object = cLObject.getObject(next);
            String stringOrNull = object.getStringOrNull("Extends");
            if (stringOrNull == null || stringOrNull.isEmpty()) {
                coreMotionScene.setConstraintSetContent(next, object.toJSON());
            } else {
                String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                if (constraintSet != null) {
                    CLObject parse = CLParser.parse(constraintSet);
                    ArrayList<String> names2 = object.names();
                    if (names2 != null) {
                        Iterator<String> it2 = names2.iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            CLElement cLElement = object.get(next2);
                            if (cLElement instanceof CLObject) {
                                override(parse, next2, (CLObject) cLElement);
                            }
                        }
                        coreMotionScene.setConstraintSetContent(next, parse.toJSON());
                    }
                }
            }
        }
    }

    public static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ArrayList<String> names;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (names = objectOrNull.names()) == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = objectOrNull.get(next);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(next, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                long parseColorString = parseColorString(cLElement.content());
                if (parseColorString != -1) {
                    constraintReference.addCustomColor(next, (int) parseColorString);
                }
            }
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) throws CLParsingException {
        CLObject parse = CLParser.parse(str);
        ArrayList<String> names = parse.names();
        if (names != null && names.size() > 0) {
            String str2 = names.get(0);
            CLElement cLElement = parse.get(str2);
            str2.getClass();
            if (str2.equals("Design") && (cLElement instanceof CLObject)) {
                CLObject cLObject = (CLObject) cLElement;
                ArrayList<String> names2 = cLObject.names();
                for (int i11 = 0; i11 < names2.size(); i11++) {
                    String str3 = names2.get(i11);
                    CLObject cLObject2 = (CLObject) cLObject.get(str3);
                    System.out.printf("element found " + str3 + "", new Object[0]);
                    String stringOrNull = cLObject2.getStringOrNull("type");
                    if (stringOrNull != null) {
                        HashMap hashMap = new HashMap();
                        int size = cLObject2.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            CLKey cLKey = (CLKey) cLObject2.get(i11);
                            String content = cLKey.content();
                            String content2 = cLKey.getValue().content();
                            if (content2 != null) {
                                hashMap.put(content, content2);
                            }
                        }
                        arrayList.add(new DesignElement(str2, stringOrNull, hashMap));
                    }
                }
            }
        }
    }

    public static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) throws CLParsingException {
        CLElement cLElement = cLObject.get(str);
        Dimension createFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                createFixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    createFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
                } else if (orNull instanceof CLString) {
                    createFixed.min(Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    createFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
                    return createFixed;
                }
                if (orNull2 instanceof CLString) {
                    createFixed.max(Dimension.WRAP_DIMENSION);
                }
            }
        }
        return createFixed;
    }

    public static Dimension parseDimensionMode(String str) {
        Dimension createFixed;
        createFixed = Dimension.createFixed(0);
        str.getClass();
        switch (str) {
            case "preferWrap":
                return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
            case "parent":
                return Dimension.createParent();
            case "spread":
                return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
            case "wrap":
                return Dimension.createWrap();
            default:
                return str.endsWith("%") ? Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0) : str.contains(":") ? Dimension.createRatio(str).suggested(Dimension.SPREAD_DIMENSION) : createFixed;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:57|(2:59|(10:61|(1:63)(1:75)|64|65|(1:67)|68|(1:70)|71|72|15))|76|64|65|(0)|68|(0)|71|72|15) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c2 A[Catch: NumberFormatException -> 0x025d, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:65:0x0238, B:67:0x0247, B:68:0x024e, B:70:0x0256, B:133:0x03b3, B:135:0x03c2, B:136:0x03c9, B:138:0x03d1), top: B:64:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d1 A[Catch: NumberFormatException -> 0x025d, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:65:0x0238, B:67:0x0247, B:68:0x024e, B:70:0x0256, B:133:0x03b3, B:135:0x03c2, B:136:0x03c9, B:138:0x03d1), top: B:64:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0247 A[Catch: NumberFormatException -> 0x025d, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:65:0x0238, B:67:0x0247, B:68:0x024e, B:70:0x0256, B:133:0x03b3, B:135:0x03c2, B:136:0x03c9, B:138:0x03d1), top: B:64:0x0238 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0256 A[Catch: NumberFormatException -> 0x025d, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x025d, blocks: (B:65:0x0238, B:67:0x0247, B:68:0x024e, B:70:0x0256, B:133:0x03b3, B:135:0x03c2, B:136:0x03c9, B:138:0x03d1), top: B:64:0x0238 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseFlowType(java.lang.String r18, androidx.constraintlayout.core.state.State r19, java.lang.String r20, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r21, androidx.constraintlayout.core.parser.CLObject r22) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseFlowType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    public static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = cLObject.get(next);
            ArrayList<String> list = layoutVariables.getList(next);
            if (list != null && (cLElement instanceof CLObject)) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    parseWidget(state, layoutVariables, it2.next(), (CLObject) cLElement);
                }
            }
        }
    }

    private static void parseGridType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        String next;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        GridReference grid = state.getGrid(str2, str);
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            next = it.next();
            next.getClass();
            i11 = 0;
            switch (next) {
                case "orientation":
                    grid.setOrientation(cLObject.get(next).getInt());
                    break;
                case "padding":
                    CLElement cLElement = cLObject.get(next);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            f11 = cLArray.getInt(0);
                            f14 = cLArray.getInt(1);
                            if (cLArray.size() > 2) {
                                f13 = cLArray.getInt(2);
                                try {
                                    f12 = ((CLArray) cLElement).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f12 = 0.0f;
                                }
                            } else {
                                f12 = f14;
                                f13 = f11;
                            }
                            grid.setPaddingStart(Math.round(toPix(state, f11)));
                            grid.setPaddingTop(Math.round(toPix(state, f14)));
                            grid.setPaddingEnd(Math.round(toPix(state, f13)));
                            grid.setPaddingBottom(Math.round(toPix(state, f12)));
                            break;
                        }
                    }
                    f11 = cLElement.getInt();
                    f12 = f11;
                    f13 = f12;
                    f14 = f13;
                    grid.setPaddingStart(Math.round(toPix(state, f11)));
                    grid.setPaddingTop(Math.round(toPix(state, f14)));
                    grid.setPaddingEnd(Math.round(toPix(state, f13)));
                    grid.setPaddingBottom(Math.round(toPix(state, f12)));
                case "contains":
                    CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull == null) {
                        break;
                    } else {
                        while (i11 < arrayOrNull.size()) {
                            grid.add(state.constraints(arrayOrNull.get(i11).content()));
                            i11++;
                        }
                        break;
                    }
                case "hGap":
                    grid.setHorizontalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case "rows":
                    int i12 = cLObject.get(next).getInt();
                    if (i12 <= 0) {
                        break;
                    } else {
                        grid.setRowsSet(i12);
                        break;
                    }
                case "vGap":
                    grid.setVerticalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case "flags":
                    String str3 = "";
                    try {
                        CLElement cLElement2 = cLObject.get(next);
                        if (cLElement2 instanceof CLNumber) {
                            i11 = cLElement2.getInt();
                        } else {
                            str3 = cLElement2.content();
                        }
                    } catch (Exception e11) {
                        System.err.println("Error parsing grid flags " + e11);
                    }
                    if (str3 != null && !str3.isEmpty()) {
                        grid.setFlags(str3);
                        break;
                    } else {
                        grid.setFlags(i11);
                        break;
                    }
                case "skips":
                    String content = cLObject.get(next).content();
                    if (content != null && content.contains(":")) {
                        grid.setSkips(content);
                        break;
                    }
                    break;
                case "spans":
                    String content2 = cLObject.get(next).content();
                    if (content2 != null && content2.contains(":")) {
                        grid.setSpans(content2);
                        break;
                    }
                    break;
                case "rowWeights":
                    String content3 = cLObject.get(next).content();
                    if (content3 != null && content3.contains(",")) {
                        grid.setRowWeights(content3);
                        break;
                    }
                    break;
                case "columns":
                    int i13 = cLObject.get(next).getInt();
                    if (i13 <= 0) {
                        break;
                    } else {
                        grid.setColumnsSet(i13);
                        break;
                    }
                case "columnWeights":
                    String content4 = cLObject.get(next).content();
                    if (content4 != null && content4.contains(",")) {
                        grid.setColumnWeights(content4);
                        break;
                    }
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, next);
                    break;
            }
        }
    }

    public static void parseGuideline(int i11, State state, CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) != null) {
            parseGuidelineParams(i11, state, stringOrNull, cLObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void parseGuidelineParams(int i11, State state, String str, CLObject cLObject) throws CLParsingException {
        String next;
        char c11;
        char c12;
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        ConstraintReference constraints = state.constraints(str);
        if (i11 == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        boolean z11 = !state.isRtl() || i11 == 0;
        GuidelineReference guidelineReference = (GuidelineReference) constraints.getFacade();
        Iterator<String> it = names.iterator();
        float f11 = 0.0f;
        boolean z12 = false;
        while (true) {
            boolean z13 = true;
            while (it.hasNext()) {
                next = it.next();
                next.getClass();
                switch (next.hashCode()) {
                    case -678927291:
                        if (next.equals("percent")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 100571:
                        if (next.equals(TtmlNode.END)) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3317767:
                        if (next.equals(TtmlNode.LEFT)) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 108511772:
                        if (next.equals(TtmlNode.RIGHT)) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 109757538:
                        if (next.equals(TtmlNode.START)) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                        if (arrayOrNull != null) {
                            if (arrayOrNull.size() > 1) {
                                String string = arrayOrNull.getString(0);
                                float f12 = arrayOrNull.getFloat(1);
                                string.getClass();
                                switch (string.hashCode()) {
                                    case 100571:
                                        if (string.equals(TtmlNode.END)) {
                                            c12 = 0;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 3317767:
                                        if (string.equals(TtmlNode.LEFT)) {
                                            c12 = 1;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 108511772:
                                        if (string.equals(TtmlNode.RIGHT)) {
                                            c12 = 2;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 109757538:
                                        if (string.equals(TtmlNode.START)) {
                                            c12 = 3;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    default:
                                        c12 = 65535;
                                        break;
                                }
                                switch (c12) {
                                    case 0:
                                        z13 = !z11;
                                        f11 = f12;
                                        break;
                                    case 1:
                                        z13 = true;
                                        f11 = f12;
                                        z12 = true;
                                        break;
                                    case 2:
                                        z13 = false;
                                        f11 = f12;
                                        break;
                                    case 3:
                                        z13 = z11;
                                        f11 = f12;
                                        break;
                                    default:
                                        f11 = f12;
                                        break;
                                }
                            }
                            z12 = true;
                            break;
                        } else {
                            f11 = cLObject.getFloat(next);
                            z12 = true;
                            z13 = true;
                            break;
                        }
                    case 1:
                        f11 = toPix(state, cLObject.getFloat(next));
                        z13 = !z11;
                        break;
                    case 3:
                        f11 = toPix(state, cLObject.getFloat(next));
                        z13 = false;
                        break;
                    case 4:
                        f11 = toPix(state, cLObject.getFloat(next));
                        z13 = z11;
                        break;
                }
            }
            if (z12) {
                if (z13) {
                    guidelineReference.percent(f11);
                    return;
                } else {
                    guidelineReference.percent(1.0f - f11);
                    return;
                }
            }
            if (z13) {
                guidelineReference.start(Float.valueOf(f11));
                return;
            } else {
                guidelineReference.end(Float.valueOf(f11));
                return;
            }
            f11 = toPix(state, cLObject.getFloat(next));
        }
    }

    public static void parseHeader(CoreMotionScene coreMotionScene, CLObject cLObject) {
        String stringOrNull = cLObject.getStringOrNull("export");
        if (stringOrNull != null) {
            coreMotionScene.setDebugName(stringOrNull);
        }
    }

    public static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        for (int i11 = 0; i11 < cLArray.size(); i11++) {
            CLElement cLElement = cLArray.get(i11);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string = cLArray2.getString(0);
                    string.getClass();
                    switch (string) {
                        case "vGuideline":
                            parseGuideline(1, state, cLArray2);
                            break;
                        case "hChain":
                            parseChain(0, state, layoutVariables, cLArray2);
                            break;
                        case "vChain":
                            parseChain(1, state, layoutVariables, cLArray2);
                            break;
                        case "hGuideline":
                            parseGuideline(0, state, cLArray2);
                            break;
                    }
                }
            }
        }
    }

    public static void parseJSON(String str, Transition transition, int i11) {
        CLObject objectOrNull;
        try {
            CLObject parse = CLParser.parse(str);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = parse.get(next);
                if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                    Iterator<String> it2 = objectOrNull.names().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        CLElement cLElement2 = objectOrNull.get(next2);
                        if (cLElement2 instanceof CLNumber) {
                            transition.addCustomFloat(i11, next, next2, cLElement2.getFloat());
                        } else if (cLElement2 instanceof CLString) {
                            long parseColorString = parseColorString(cLElement2.content());
                            if (parseColorString != -1) {
                                transition.addCustomColor(i11, next, next2, (int) parseColorString);
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e11) {
            System.err.println("Error parsing JSON " + e11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) throws CLParsingException {
        char c11;
        if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> names = cLObject.names();
            if (names == null) {
                return;
            }
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                next.getClass();
                switch (next.hashCode()) {
                    case -1897525331:
                        if (next.equals("stagger")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1310311125:
                        if (next.equals("easing")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1285003983:
                        if (next.equals("quantize")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -791482387:
                        if (next.equals("pathArc")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -236944793:
                        if (next.equals("relativeTo")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        typedBundle.add(600, cLObject.getFloat(next));
                        break;
                    case 1:
                        typedBundle.add(TypedValues.MotionType.TYPE_EASING, cLObject.getString(next));
                        break;
                    case 2:
                        CLElement cLElement2 = cLObject.get(next);
                        if (!(cLElement2 instanceof CLArray)) {
                            typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLObject.getInt(next));
                            break;
                        } else {
                            CLArray cLArray = (CLArray) cLElement2;
                            int size = cLArray.size();
                            if (size <= 0) {
                                break;
                            } else {
                                typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLArray.getInt(0));
                                if (size <= 1) {
                                    break;
                                } else {
                                    typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, cLArray.getString(1));
                                    if (size <= 2) {
                                        break;
                                    } else {
                                        typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, cLArray.getFloat(2));
                                        break;
                                    }
                                }
                            }
                        }
                    case 3:
                        String string = cLObject.getString(next);
                        int indexOf = indexOf(string, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (indexOf != -1) {
                            typedBundle.add(TypedValues.MotionType.TYPE_PATHMOTION_ARC, indexOf);
                            break;
                        } else {
                            System.err.println(cLObject.getLine() + " pathArc = '" + string + "'");
                            break;
                        }
                    case 4:
                        typedBundle.add(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, cLObject.getString(next));
                        break;
                }
            }
            constraintReference.mMotionProperties = typedBundle;
        }
    }

    public static void parseMotionSceneJSON(CoreMotionScene coreMotionScene, String str) {
        try {
            CLObject parse = CLParser.parse(str);
            ArrayList<String> names = parse.names();
            if (names == null) {
                return;
            }
            Iterator<String> it = names.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CLElement cLElement = parse.get(next);
                if (cLElement instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement;
                    int hashCode = next.hashCode();
                    if (hashCode != -2137403731) {
                        if (hashCode != -241441378) {
                            if (hashCode == 1101852654 && next.equals("ConstraintSets")) {
                                parseConstraintSets(coreMotionScene, cLObject);
                            }
                        } else if (next.equals(TypedValues.TransitionType.NAME)) {
                            parseTransitions(coreMotionScene, cLObject);
                        }
                    } else if (next.equals("Header")) {
                        parseHeader(coreMotionScene, cLObject);
                    }
                }
            }
        } catch (CLParsingException e11) {
            System.err.println("Error parsing JSON " + e11);
        }
    }

    public static void parseTransitions(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            coreMotionScene.setTransitionContent(next, cLObject.getObject(next).toJSON());
        }
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = cLObject.get(next);
            if (cLElement instanceof CLNumber) {
                layoutVariables.put(next, cLElement.getInt());
            } else if (cLElement instanceof CLObject) {
                CLObject cLObject2 = (CLObject) cLElement;
                if (cLObject2.has("from") && cLObject2.has("to")) {
                    layoutVariables.put(next, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("to")), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                } else if (cLObject2.has("from") && cLObject2.has("step")) {
                    layoutVariables.put(next, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("step")));
                } else if (cLObject2.has("ids")) {
                    CLArray array = cLObject2.getArray("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i11 = 0; i11 < array.size(); i11++) {
                        arrayList.add(array.getString(i11));
                    }
                    layoutVariables.put(next, arrayList);
                } else if (cLObject2.has("tag")) {
                    layoutVariables.put(next, state.getIdsForTag(cLObject2.getString("tag")));
                }
            }
        }
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        parseWidget(state, layoutVariables, state.constraints(str), cLObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00bc, code lost:
    
        if (r3.equals("hChain") == false) goto L30;
     */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void populateState(@androidx.annotation.NonNull androidx.constraintlayout.core.parser.CLObject r9, @androidx.annotation.NonNull androidx.constraintlayout.core.state.State r10, @androidx.annotation.NonNull androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r11) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.populateState(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables):void");
    }

    private static float toPix(State state, float f11) {
        return state.getDpToPixel().toPixels(f11);
    }

    public static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) throws CLParsingException {
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> names = cLObject.names();
        if (names == null) {
            return;
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            applyAttribute(state, layoutVariables, constraintReference, cLObject, it.next());
        }
    }

    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) throws CLParsingException {
        try {
            populateState(CLParser.parse(str), state, layoutVariables);
        } catch (CLParsingException e11) {
            System.err.println("Error parsing JSON " + e11);
        }
    }
}
