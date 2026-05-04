package org.mozilla.javascript.tools.idswitch;

import com.alipay.sdk.m.u.i;
import com.huawei.hms.framework.common.ContainerUtils;
import l70.f;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.tools.ToolErrorReporter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class SwitchGenerator {
    private CodePrinter P;
    private ToolErrorReporter R;
    private boolean c_was_defined;
    private int[] columns;
    private String default_value;
    private IdValuePair[] pairs;
    private String source_file;
    String v_switch_label = "L0";
    String v_label = "L";
    String v_s = "s";
    String v_c = "c";
    String v_guess = "X";
    String v_id = "id";
    String v_length_suffix = "_length";
    int use_if_threshold = 3;
    int char_tail_test_threshold = 2;

    private static boolean bigger(IdValuePair idValuePair, IdValuePair idValuePair2, int i11) {
        if (i11 >= 0) {
            return idValuePair.f78410id.charAt(i11) > idValuePair2.f78410id.charAt(i11);
        }
        int i12 = idValuePair.idLength - idValuePair2.idLength;
        return i12 != 0 ? i12 > 0 : idValuePair.f78410id.compareTo(idValuePair2.f78410id) > 0;
    }

    private void check_all_is_different(int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        IdValuePair idValuePair = this.pairs[i11];
        while (true) {
            i11++;
            if (i11 == i12) {
                return;
            }
            IdValuePair idValuePair2 = this.pairs[i11];
            if (idValuePair.f78410id.equals(idValuePair2.f78410id)) {
                throw on_same_pair_fail(idValuePair, idValuePair2);
            }
            idValuePair = idValuePair2;
        }
    }

    private int count_different_chars(int i11, int i12, int i13) {
        int i14 = 0;
        char c11 = 65535;
        while (i11 != i12) {
            char charAt = this.pairs[i11].f78410id.charAt(i13);
            if (charAt != c11) {
                i14++;
                c11 = charAt;
            }
            i11++;
        }
        return i14;
    }

    private int count_different_lengths(int i11, int i12) {
        int i13 = 0;
        int i14 = -1;
        while (i11 != i12) {
            int i15 = this.pairs[i11].idLength;
            if (i14 != i15) {
                i13++;
                i14 = i15;
            }
            i11++;
        }
        return i13;
    }

    private int find_max_different_column(int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 != i13; i16++) {
            int i17 = this.columns[i16];
            sort_pairs(i11, i12, i17);
            int count_different_chars = count_different_chars(i11, i12, i17);
            if (count_different_chars == i12 - i11) {
                return i16;
            }
            if (i15 < count_different_chars) {
                i14 = i16;
                i15 = count_different_chars;
            }
        }
        if (i14 != i13 - 1) {
            sort_pairs(i11, i12, this.columns[i14]);
        }
        return i14;
    }

    private void generate_body(int i11, int i12, int i13) {
        this.P.indent(i13);
        this.P.p(this.v_switch_label);
        this.P.p(": { ");
        this.P.p(this.v_id);
        this.P.p(" = ");
        this.P.p(this.default_value);
        this.P.p("; String ");
        this.P.p(this.v_guess);
        this.P.p(" = null;");
        this.c_was_defined = false;
        int offset = this.P.getOffset();
        this.P.p(" int ");
        this.P.p(this.v_c);
        this.P.p(f.f70689d);
        int offset2 = this.P.getOffset();
        this.P.nl();
        int i14 = i13 + 1;
        generate_length_switch(i11, i12, i14);
        if (!this.c_was_defined) {
            this.P.erase(offset, offset2);
        }
        this.P.indent(i14);
        this.P.p("if (");
        this.P.p(this.v_guess);
        this.P.p("!=null && ");
        this.P.p(this.v_guess);
        this.P.p("!=");
        this.P.p(this.v_s);
        this.P.p(" && !");
        this.P.p(this.v_guess);
        this.P.p(".equals(");
        this.P.p(this.v_s);
        this.P.p(")) ");
        this.P.p(this.v_id);
        this.P.p(" = ");
        this.P.p(this.default_value);
        this.P.p(i.f11097b);
        this.P.nl();
        this.P.indent(i14);
        this.P.p("break ");
        this.P.p(this.v_switch_label);
        this.P.p(i.f11097b);
        this.P.nl();
        this.P.line(i13, i.f11099d);
    }

    private void generate_length_switch(int i11, int i12, int i13) {
        boolean z11;
        int i14;
        sort_pairs(i11, i12, -1);
        check_all_is_different(i11, i12);
        int count_different_lengths = count_different_lengths(i11, i12);
        this.columns = new int[this.pairs[i12 - 1].idLength];
        int i15 = 0;
        if (count_different_lengths <= this.use_if_threshold) {
            if (count_different_lengths != 1) {
                this.P.indent(i13);
                this.P.p("int ");
                this.P.p(this.v_s);
                this.P.p(this.v_length_suffix);
                this.P.p(" = ");
                this.P.p(this.v_s);
                this.P.p(".length();");
                this.P.nl();
            }
            z11 = true;
        } else {
            this.P.indent(i13);
            this.P.p(this.v_label);
            this.P.p(": switch (");
            this.P.p(this.v_s);
            this.P.p(".length()) {");
            this.P.nl();
            z11 = false;
        }
        int i16 = this.pairs[i11].idLength;
        int i17 = i11;
        while (true) {
            int i18 = i17;
            while (true) {
                i14 = i17 + 1;
                if (i14 == i12 || (i15 = this.pairs[i14].idLength) != i16) {
                    break;
                } else {
                    i17 = i14;
                }
            }
            if (z11) {
                this.P.indent(i13);
                if (i18 != i11) {
                    this.P.p("else ");
                }
                this.P.p("if (");
                if (count_different_lengths == 1) {
                    this.P.p(this.v_s);
                    this.P.p(".length()==");
                } else {
                    this.P.p(this.v_s);
                    this.P.p(this.v_length_suffix);
                    this.P.p("==");
                }
                this.P.p(i16);
                this.P.p(") {");
            } else {
                this.P.indent(i13);
                this.P.p("case ");
                this.P.p(i16);
                this.P.p(":");
            }
            generate_letter_switch(i18, i14, i13 + 1, !z11, z11);
            if (z11) {
                this.P.p(i.f11099d);
                this.P.nl();
            } else {
                this.P.p("break ");
                this.P.p(this.v_label);
                this.P.p(i.f11097b);
                this.P.nl();
            }
            if (i14 == i12) {
                break;
            }
            i16 = i15;
            i17 = i14;
        }
        if (z11) {
            return;
        }
        this.P.indent(i13);
        this.P.p(i.f11099d);
        this.P.nl();
    }

    private void generate_letter_switch(int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = this.pairs[i11].idLength;
        for (int i15 = 0; i15 != i14; i15++) {
            this.columns[i15] = i15;
        }
        generate_letter_switch_r(i11, i12, i14, i13, z11, z12);
    }

    private boolean generate_letter_switch_r(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i15;
        int i16;
        boolean z17 = false;
        int i17 = 1;
        if (i11 + 1 == i12) {
            this.P.p(' ');
            IdValuePair idValuePair = this.pairs[i11];
            if (i13 > this.char_tail_test_threshold) {
                this.P.p(this.v_guess);
                this.P.p(ContainerUtils.KEY_VALUE_DELIMITER);
                this.P.qstring(idValuePair.f78410id);
                this.P.p(i.f11097b);
                this.P.p(this.v_id);
                this.P.p(ContainerUtils.KEY_VALUE_DELIMITER);
                this.P.p(idValuePair.value);
                this.P.p(i.f11097b);
            } else if (i13 == 0) {
                this.P.p(this.v_id);
                this.P.p(ContainerUtils.KEY_VALUE_DELIMITER);
                this.P.p(idValuePair.value);
                this.P.p("; break ");
                this.P.p(this.v_switch_label);
                this.P.p(i.f11097b);
                z17 = true;
            } else {
                this.P.p("if (");
                int i18 = this.columns[0];
                this.P.p(this.v_s);
                this.P.p(".charAt(");
                this.P.p(i18);
                this.P.p(")==");
                this.P.qchar(idValuePair.f78410id.charAt(i18));
                while (i17 != i13) {
                    this.P.p(" && ");
                    int i19 = this.columns[i17];
                    this.P.p(this.v_s);
                    this.P.p(".charAt(");
                    this.P.p(i19);
                    this.P.p(")==");
                    this.P.qchar(idValuePair.f78410id.charAt(i19));
                    i17++;
                }
                this.P.p(") {");
                this.P.p(this.v_id);
                this.P.p(ContainerUtils.KEY_VALUE_DELIMITER);
                this.P.p(idValuePair.value);
                this.P.p("; break ");
                this.P.p(this.v_switch_label);
                this.P.p(";}");
            }
            this.P.p(' ');
            return z17;
        }
        int find_max_different_column = find_max_different_column(i11, i12, i13);
        int i21 = this.columns[find_max_different_column];
        int count_different_chars = count_different_chars(i11, i12, i21);
        int[] iArr = this.columns;
        int i22 = i13 - 1;
        iArr[find_max_different_column] = iArr[i22];
        if (z12) {
            this.P.nl();
            this.P.indent(i14);
        } else {
            this.P.p(' ');
        }
        if (count_different_chars <= this.use_if_threshold) {
            this.c_was_defined = true;
            this.P.p(this.v_c);
            this.P.p(ContainerUtils.KEY_VALUE_DELIMITER);
            this.P.p(this.v_s);
            this.P.p(".charAt(");
            this.P.p(i21);
            this.P.p(");");
            z14 = z11;
            z15 = true;
        } else {
            if (z11) {
                z13 = z11;
            } else {
                this.P.p(this.v_label);
                this.P.p(": ");
                z13 = true;
            }
            this.P.p("switch (");
            this.P.p(this.v_s);
            this.P.p(".charAt(");
            this.P.p(i21);
            this.P.p(")) {");
            z14 = z13;
            z15 = false;
        }
        char charAt = this.pairs[i11].f78410id.charAt(i21);
        int i23 = i22;
        int i24 = i11;
        int i25 = i24;
        char c11 = 0;
        while (true) {
            i25 += i17;
            z16 = z17;
            if (i25 != i12) {
                char charAt2 = this.pairs[i25].f78410id.charAt(i21);
                c11 = charAt2;
                if (charAt2 == charAt) {
                    z17 = z16;
                }
            }
            if (z15) {
                this.P.nl();
                this.P.indent(i14);
                if (i24 != i11) {
                    i15 = i17;
                    this.P.p("else ");
                } else {
                    i15 = i17;
                }
                this.P.p("if (");
                this.P.p(this.v_c);
                this.P.p("==");
                this.P.qchar(charAt);
                this.P.p(") {");
            } else {
                i15 = i17;
                this.P.nl();
                this.P.indent(i14);
                this.P.p("case ");
                this.P.qchar(charAt);
                this.P.p(":");
            }
            i16 = i21;
            int i26 = i23;
            boolean generate_letter_switch_r = generate_letter_switch_r(i24, i25, i26, i14 + 1, z14, z15);
            i23 = i26;
            if (z15) {
                this.P.p(i.f11099d);
            } else if (!generate_letter_switch_r) {
                this.P.p("break ");
                this.P.p(this.v_label);
                this.P.p(i.f11097b);
            }
            if (i25 == i12) {
                break;
            }
            i24 = i25;
            i25 = i24;
            i21 = i16;
            charAt = c11;
            z17 = z16;
            i17 = i15;
        }
        if (z15) {
            this.P.nl();
            if (z12) {
                this.P.indent(i14 - 1);
            } else {
                this.P.indent(i14);
            }
        } else {
            this.P.nl();
            this.P.indent(i14);
            this.P.p(i.f11099d);
            if (z12) {
                this.P.nl();
                this.P.indent(i14 - 1);
            } else {
                this.P.p(' ');
            }
        }
        this.columns[find_max_different_column] = i16;
        return z16;
    }

    private static void heap4Sort(IdValuePair[] idValuePairArr, int i11, int i12, int i13) {
        if (i12 <= 1) {
            return;
        }
        makeHeap4(idValuePairArr, i11, i12, i13);
        while (i12 > 1) {
            i12--;
            int i14 = i11 + i12;
            IdValuePair idValuePair = idValuePairArr[i14];
            idValuePairArr[i14] = idValuePairArr[i11];
            idValuePairArr[i11] = idValuePair;
            heapify4(idValuePairArr, i11, i12, 0, i13);
        }
    }

    private static void heapify4(IdValuePair[] idValuePairArr, int i11, int i12, int i13, int i14) {
        IdValuePair idValuePair = idValuePairArr[i11 + i13];
        while (true) {
            int i15 = i13 << 2;
            int i16 = i15 | 1;
            int i17 = i15 | 2;
            int i18 = i15 | 3;
            int i19 = i15 + 4;
            if (i19 >= i12) {
                if (i16 < i12) {
                    IdValuePair idValuePair2 = idValuePairArr[i11 + i16];
                    if (i17 != i12) {
                        IdValuePair idValuePair3 = idValuePairArr[i11 + i17];
                        if (bigger(idValuePair3, idValuePair2, i14)) {
                            i16 = i17;
                            idValuePair2 = idValuePair3;
                        }
                        if (i18 != i12) {
                            IdValuePair idValuePair4 = idValuePairArr[i11 + i18];
                            if (bigger(idValuePair4, idValuePair2, i14)) {
                                idValuePair2 = idValuePair4;
                                i16 = i18;
                            }
                        }
                    }
                    if (bigger(idValuePair2, idValuePair, i14)) {
                        idValuePairArr[i13 + i11] = idValuePair2;
                        idValuePairArr[i11 + i16] = idValuePair;
                        return;
                    }
                    return;
                }
                return;
            }
            IdValuePair idValuePair5 = idValuePairArr[i11 + i16];
            IdValuePair idValuePair6 = idValuePairArr[i11 + i17];
            IdValuePair idValuePair7 = idValuePairArr[i11 + i18];
            IdValuePair idValuePair8 = idValuePairArr[i11 + i19];
            if (bigger(idValuePair6, idValuePair5, i14)) {
                i16 = i17;
                idValuePair5 = idValuePair6;
            }
            if (bigger(idValuePair8, idValuePair7, i14)) {
                i18 = i19;
                idValuePair7 = idValuePair8;
            }
            if (bigger(idValuePair7, idValuePair5, i14)) {
                i16 = i18;
                idValuePair5 = idValuePair7;
            }
            if (bigger(idValuePair, idValuePair5, i14)) {
                return;
            }
            idValuePairArr[i13 + i11] = idValuePair5;
            idValuePairArr[i11 + i16] = idValuePair;
            i13 = i16;
        }
    }

    private static void makeHeap4(IdValuePair[] idValuePairArr, int i11, int i12, int i13) {
        int i14 = (i12 + 2) >> 2;
        while (i14 != 0) {
            i14--;
            heapify4(idValuePairArr, i11, i12, i14, i13);
        }
    }

    private EvaluatorException on_same_pair_fail(IdValuePair idValuePair, IdValuePair idValuePair2) {
        int i11;
        int lineNumber = idValuePair.getLineNumber();
        int lineNumber2 = idValuePair2.getLineNumber();
        if (lineNumber2 > lineNumber) {
            i11 = lineNumber2;
        } else {
            i11 = lineNumber;
            lineNumber = lineNumber2;
        }
        return this.R.runtimeError(ToolErrorReporter.getMessage("msg.idswitch.same_string", idValuePair.f78410id, new Integer(lineNumber)), this.source_file, i11, null, 0);
    }

    private void sort_pairs(int i11, int i12, int i13) {
        heap4Sort(this.pairs, i11, i12 - i11, i13);
    }

    public void generateSwitch(String[] strArr, String str) {
        int length = strArr.length / 2;
        IdValuePair[] idValuePairArr = new IdValuePair[length];
        for (int i11 = 0; i11 != length; i11++) {
            int i12 = i11 * 2;
            idValuePairArr[i11] = new IdValuePair(strArr[i12], strArr[i12 + 1]);
        }
        generateSwitch(idValuePairArr, str);
    }

    public CodePrinter getCodePrinter() {
        return this.P;
    }

    public ToolErrorReporter getReporter() {
        return this.R;
    }

    public String getSourceFileName() {
        return this.source_file;
    }

    public void setCodePrinter(CodePrinter codePrinter) {
        this.P = codePrinter;
    }

    public void setReporter(ToolErrorReporter toolErrorReporter) {
        this.R = toolErrorReporter;
    }

    public void setSourceFileName(String str) {
        this.source_file = str;
    }

    public void generateSwitch(IdValuePair[] idValuePairArr, String str) {
        int length = idValuePairArr.length;
        if (length == 0) {
            return;
        }
        this.pairs = idValuePairArr;
        this.default_value = str;
        generate_body(0, length, 2);
    }
}
