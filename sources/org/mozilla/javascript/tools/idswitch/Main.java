package org.mozilla.javascript.tools.idswitch;

import c80.f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.tools.ToolErrorReporter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Main {
    private static final int GENERATED_TAG = 2;
    private static final String GENERATED_TAG_STR = "generated";
    private static final int NORMAL_LINE = 0;
    private static final int STRING_TAG = 3;
    private static final String STRING_TAG_STR = "string";
    private static final int SWITCH_TAG = 1;
    private static final String SWITCH_TAG_STR = "string_id_map";
    private CodePrinter P;
    private ToolErrorReporter R;
    private final List<IdValuePair> all_pairs = new ArrayList();
    private FileBody body;
    private String source_file;
    private int tag_definition_end;
    private int tag_value_end;
    private int tag_value_start;

    private void add_id(char[] cArr, int i11, int i12, int i13, int i14) {
        IdValuePair idValuePair = new IdValuePair(new String(cArr, i13, i14 - i13), new String(cArr, i11, i12 - i11));
        idValuePair.setLineNumber(this.body.getLineNumber());
        this.all_pairs.add(idValuePair);
    }

    private static boolean equals(String str, char[] cArr, int i11, int i12) {
        if (str.length() != i12 - i11) {
            return false;
        }
        int i13 = 0;
        while (i11 != i12) {
            if (cArr[i11] != str.charAt(i13)) {
                return false;
            }
            i11++;
            i13++;
        }
        return true;
    }

    private int exec(String[] strArr) {
        this.R = new ToolErrorReporter(true, System.err);
        int process_options = process_options(strArr);
        if (process_options == 0) {
            option_error(ToolErrorReporter.getMessage("msg.idswitch.no_file_argument"));
            return -1;
        }
        if (process_options > 1) {
            option_error(ToolErrorReporter.getMessage("msg.idswitch.too_many_arguments"));
            return -1;
        }
        CodePrinter codePrinter = new CodePrinter();
        this.P = codePrinter;
        codePrinter.setIndentStep(4);
        this.P.setIndentTabSize(0);
        try {
            process_file(strArr[0]);
            return 0;
        } catch (IOException e11) {
            print_error(ToolErrorReporter.getMessage("msg.idswitch.io_error", e11.toString()));
            return -1;
        } catch (EvaluatorException unused) {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r7 = skip_white_space(r10, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r7 == r12) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        r8 = r10[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r8 == '=') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r8 != '#') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r11 = get_tag_id(r10, r3, r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r11 == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        if (r8 != '#') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (is_value_type(r11) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        r1 = "msg.idswitch.no_end_usage";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        r9.tag_definition_end = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r1 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        throw r9.R.runtimeError(org.mozilla.javascript.tools.ToolErrorReporter.getMessage(r1, tag_name(r11)), r9.source_file, r9.body.getLineNumber(), null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
    
        if (r0 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        r1 = "msg.idswitch.no_end_with_value";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
    
        r11 = extract_tag_value(r10, r7 + 1, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0072, code lost:
    
        if (is_value_type(r11) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        r1 = "msg.idswitch.no_value_allowed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int extract_line_tag_id(char[] r10, int r11, int r12) {
        /*
            r9 = this;
            int r11 = skip_white_space(r10, r11, r12)
            int r0 = r9.look_for_slash_slash(r10, r11, r12)
            r1 = 0
            if (r0 == r12) goto L98
            int r11 = r11 + 2
            r2 = 1
            if (r11 != r0) goto L12
            r11 = r2
            goto L13
        L12:
            r11 = r1
        L13:
            int r0 = skip_white_space(r10, r0, r12)
            if (r0 == r12) goto L98
            char r3 = r10[r0]
            r4 = 35
            if (r3 != r4) goto L98
            int r3 = r0 + 1
            if (r3 == r12) goto L2d
            char r5 = r10[r3]
            r6 = 47
            if (r5 != r6) goto L2d
            int r3 = r0 + 2
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r5 = r3
        L2f:
            r6 = 61
            if (r5 == r12) goto L43
            char r7 = r10[r5]
            if (r7 == r4) goto L43
            if (r7 == r6) goto L43
            boolean r7 = is_white_space(r7)
            if (r7 == 0) goto L40
            goto L43
        L40:
            int r5 = r5 + 1
            goto L2f
        L43:
            if (r5 == r12) goto L98
            int r7 = skip_white_space(r10, r5, r12)
            if (r7 == r12) goto L98
            char r8 = r10[r7]
            if (r8 == r6) goto L51
            if (r8 != r4) goto L98
        L51:
            int r11 = r9.get_tag_id(r10, r3, r5, r11)
            if (r11 == 0) goto L97
            r1 = 0
            if (r8 != r4) goto L69
            if (r0 == 0) goto L65
            int r11 = -r11
            boolean r10 = is_value_type(r11)
            if (r10 == 0) goto L65
            java.lang.String r1 = "msg.idswitch.no_end_usage"
        L65:
            int r7 = r7 + r2
            r9.tag_definition_end = r7
            goto L7b
        L69:
            if (r0 == 0) goto L6e
            java.lang.String r1 = "msg.idswitch.no_end_with_value"
            goto L76
        L6e:
            boolean r0 = is_value_type(r11)
            if (r0 != 0) goto L76
            java.lang.String r1 = "msg.idswitch.no_value_allowed"
        L76:
            int r7 = r7 + r2
            int r11 = r9.extract_tag_value(r10, r7, r12, r11)
        L7b:
            if (r1 != 0) goto L7e
            return r11
        L7e:
            java.lang.String r10 = tag_name(r11)
            java.lang.String r3 = org.mozilla.javascript.tools.ToolErrorReporter.getMessage(r1, r10)
            org.mozilla.javascript.tools.ToolErrorReporter r2 = r9.R
            java.lang.String r4 = r9.source_file
            org.mozilla.javascript.tools.idswitch.FileBody r10 = r9.body
            int r5 = r10.getLineNumber()
            r6 = 0
            r7 = 0
            org.mozilla.javascript.EvaluatorException r10 = r2.runtimeError(r3, r4, r5, r6, r7)
            throw r10
        L97:
            return r11
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.idswitch.Main.extract_line_tag_id(char[], int, int):int");
    }

    private int extract_tag_value(char[] cArr, int i11, int i12, int i13) {
        int i14;
        int skip_white_space = skip_white_space(cArr, i11, i12);
        if (skip_white_space == i12) {
            return 0;
        }
        int i15 = skip_white_space;
        while (true) {
            if (i15 == i12) {
                i14 = skip_white_space;
                break;
            }
            char c11 = cArr[i15];
            if (is_white_space(c11)) {
                int skip_white_space2 = skip_white_space(cArr, i15 + 1, i12);
                if (skip_white_space2 != i12 && cArr[skip_white_space2] == '#') {
                    i14 = i15;
                    i15 = skip_white_space2;
                    break;
                }
                i15 = skip_white_space2 + 1;
            } else {
                if (c11 == '#') {
                    i14 = i15;
                    break;
                }
                i15++;
            }
        }
        if (i15 == i12) {
            return 0;
        }
        this.tag_value_start = skip_white_space;
        this.tag_value_end = i14;
        this.tag_definition_end = i15 + 1;
        return i13;
    }

    private void generate_java_code() {
        this.P.clear();
        IdValuePair[] idValuePairArr = new IdValuePair[this.all_pairs.size()];
        this.all_pairs.toArray(idValuePairArr);
        SwitchGenerator switchGenerator = new SwitchGenerator();
        switchGenerator.char_tail_test_threshold = 2;
        switchGenerator.setReporter(this.R);
        switchGenerator.setCodePrinter(this.P);
        switchGenerator.generateSwitch(idValuePairArr, "0");
    }

    private int get_tag_id(char[] cArr, int i11, int i12, boolean z11) {
        if (z11) {
            if (equals(SWITCH_TAG_STR, cArr, i11, i12)) {
                return 1;
            }
            if (equals(GENERATED_TAG_STR, cArr, i11, i12)) {
                return 2;
            }
        }
        return equals("string", cArr, i11, i12) ? 3 : 0;
    }

    private String get_time_stamp() {
        return new SimpleDateFormat(" 'Last update:' yyyy-MM-dd HH:mm:ss z").format(new Date());
    }

    private static boolean is_value_type(int i11) {
        return i11 == 3;
    }

    private static boolean is_white_space(int i11) {
        return i11 == 32 || i11 == 9;
    }

    private void look_for_id_definitions(char[] cArr, int i11, int i12, boolean z11) {
        int skip_name_char;
        int skip_white_space;
        int i13;
        int skip_white_space2 = skip_white_space(cArr, i11, i12);
        int skip_matched_prefix = skip_matched_prefix("Id_", cArr, skip_white_space2, i12);
        if (skip_matched_prefix < 0 || skip_matched_prefix == (skip_name_char = skip_name_char(cArr, skip_matched_prefix, i12)) || (skip_white_space = skip_white_space(cArr, skip_name_char, i12)) == i12 || cArr[skip_white_space] != '=') {
            return;
        }
        if (z11) {
            skip_matched_prefix = this.tag_value_start;
            i13 = this.tag_value_end;
        } else {
            i13 = skip_name_char;
        }
        add_id(cArr, skip_white_space2, skip_name_char, skip_matched_prefix, i13);
    }

    private int look_for_slash_slash(char[] cArr, int i11, int i12) {
        while (i11 + 2 <= i12) {
            int i13 = i11 + 1;
            if (cArr[i11] == '/') {
                i11 += 2;
                if (cArr[i13] == '/') {
                    return i11;
                }
            } else {
                i11 = i13;
            }
        }
        return i12;
    }

    public static void main(String[] strArr) {
        System.exit(new Main().exec(strArr));
    }

    private void option_error(String str) {
        print_error(ToolErrorReporter.getMessage("msg.idswitch.bad_invocation", str));
    }

    private void print_error(String str) {
        System.err.println(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int process_options(java.lang.String[] r14) {
        /*
            r13 = this;
            int r0 = r14.length
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L5:
            r5 = 1
            if (r2 == r0) goto L66
            r6 = r14[r2]
            int r7 = r6.length()
            r8 = 2
            if (r7 < r8) goto L63
            char r9 = r6.charAt(r1)
            r10 = 45
            if (r9 != r10) goto L63
            char r9 = r6.charAt(r5)
            r11 = -1
            r12 = 0
            if (r9 != r10) goto L44
            if (r7 != r8) goto L26
            r14[r2] = r12
            goto L66
        L26:
            java.lang.String r7 = "--help"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L30
            r3 = r5
            goto L61
        L30:
            java.lang.String r7 = "--version"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L3a
            r4 = r5
            goto L61
        L3a:
            java.lang.String r0 = "msg.idswitch.bad_option"
            java.lang.String r0 = org.mozilla.javascript.tools.ToolErrorReporter.getMessage(r0, r6)
            r13.option_error(r0)
            goto L67
        L44:
            r8 = r5
        L45:
            if (r8 == r7) goto L61
            char r9 = r6.charAt(r8)
            r10 = 104(0x68, float:1.46E-43)
            if (r9 == r10) goto L5d
            java.lang.String r0 = "msg.idswitch.bad_option_char"
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r0 = org.mozilla.javascript.tools.ToolErrorReporter.getMessage(r0, r2)
            r13.option_error(r0)
            goto L67
        L5d:
            int r8 = r8 + 1
            r3 = r5
            goto L45
        L61:
            r14[r2] = r12
        L63:
            int r2 = r2 + 1
            goto L5
        L66:
            r11 = r5
        L67:
            if (r11 != r5) goto L75
            if (r3 == 0) goto L6f
            r13.show_usage()
            r11 = r1
        L6f:
            if (r4 == 0) goto L75
            r13.show_version()
            goto L76
        L75:
            r1 = r11
        L76:
            if (r1 == r5) goto L7b
            java.lang.System.exit(r1)
        L7b:
            int r14 = r13.remove_nulls(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.idswitch.Main.process_options(java.lang.String[]):int");
    }

    private int remove_nulls(String[] strArr) {
        int length = strArr.length;
        int i11 = 0;
        while (i11 != length && strArr[i11] != null) {
            i11++;
        }
        if (i11 != length) {
            for (int i12 = i11 + 1; i12 != length; i12++) {
                String str = strArr[i12];
                if (str != null) {
                    strArr[i11] = str;
                    i11++;
                }
            }
        }
        return i11;
    }

    private void show_usage() {
        System.out.println(ToolErrorReporter.getMessage("msg.idswitch.usage"));
        System.out.println();
    }

    private void show_version() {
        System.out.println(ToolErrorReporter.getMessage("msg.idswitch.version"));
    }

    private static int skip_matched_prefix(String str, char[] cArr, int i11, int i12) {
        int length = str.length();
        if (length > i12 - i11) {
            return -1;
        }
        int i13 = 0;
        while (i13 != length) {
            if (str.charAt(i13) != cArr[i11]) {
                return -1;
            }
            i13++;
            i11++;
        }
        return i11;
    }

    private static int skip_name_char(char[] cArr, int i11, int i12) {
        while (i11 != i12) {
            char c11 = cArr[i11];
            if (('a' > c11 || c11 > 'z') && (('A' > c11 || c11 > 'Z') && (('0' > c11 || c11 > '9') && c11 != '_'))) {
                break;
            }
            i11++;
        }
        return i11;
    }

    private static int skip_white_space(char[] cArr, int i11, int i12) {
        while (i11 != i12 && is_white_space(cArr[i11])) {
            i11++;
        }
        return i11;
    }

    private static String tag_name(int i11) {
        return i11 != -2 ? i11 != -1 ? i11 != 1 ? i11 != 2 ? "" : GENERATED_TAG_STR : SWITCH_TAG_STR : "/string_id_map" : "/generated";
    }

    public void process_file(String str) throws IOException {
        this.source_file = str;
        this.body = new FileBody();
        InputStream fileInputStream = str.equals(Constants.ACCEPT_TIME_SEPARATOR_SERVER) ? System.in : new FileInputStream(str);
        try {
            this.body.readData(new InputStreamReader(fileInputStream, f.f8336y));
            fileInputStream.close();
            process_file();
            if (this.body.wasModified()) {
                OutputStream fileOutputStream = str.equals(Constants.ACCEPT_TIME_SEPARATOR_SERVER) ? System.out : new FileOutputStream(str);
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    this.body.writeData(outputStreamWriter);
                    outputStreamWriter.flush();
                } finally {
                    fileOutputStream.close();
                }
            }
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
    }

    private void process_file() {
        char[] buffer = this.body.getBuffer();
        this.body.startLineLoop();
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (this.body.nextLine()) {
            int lineBegin = this.body.getLineBegin();
            int lineEnd = this.body.getLineEnd();
            int extract_line_tag_id = extract_line_tag_id(buffer, lineBegin, lineEnd);
            boolean z11 = true;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (extract_line_tag_id == 0) {
                            if (i12 < 0) {
                                z11 = false;
                                i12 = lineBegin;
                            }
                        } else if (extract_line_tag_id == -2) {
                            if (i12 < 0) {
                                i12 = lineBegin;
                            }
                            i13 = lineBegin;
                            i11 = 1;
                        }
                    }
                    z11 = false;
                } else {
                    if (extract_line_tag_id == 0) {
                        look_for_id_definitions(buffer, lineBegin, lineEnd, false);
                    } else if (extract_line_tag_id == 3) {
                        look_for_id_definitions(buffer, lineBegin, lineEnd, true);
                    } else if (extract_line_tag_id == 2) {
                        if (i12 < 0) {
                            i14 = this.tag_definition_end;
                            z11 = false;
                            i15 = lineEnd;
                            i11 = 2;
                        }
                    } else if (extract_line_tag_id == -1) {
                        if (i12 >= 0 && !this.all_pairs.isEmpty()) {
                            generate_java_code();
                            if (this.body.setReplacement(i12, i13, this.P.toString())) {
                                this.body.setReplacement(i14, i15, get_time_stamp());
                            }
                        }
                        i11 = 0;
                        z11 = false;
                    }
                    z11 = false;
                }
            } else if (extract_line_tag_id == 1) {
                this.all_pairs.clear();
                i12 = -1;
                i11 = 1;
                z11 = false;
            } else {
                if (extract_line_tag_id == -1) {
                }
                z11 = false;
            }
            if (z11) {
                throw this.R.runtimeError(ToolErrorReporter.getMessage("msg.idswitch.bad_tag_order", tag_name(extract_line_tag_id)), this.source_file, this.body.getLineNumber(), null, 0);
            }
        }
        if (i11 == 0) {
            return;
        }
        throw this.R.runtimeError(ToolErrorReporter.getMessage("msg.idswitch.file_end_in_switch", tag_name(i11)), this.source_file, this.body.getLineNumber(), null, 0);
    }
}
