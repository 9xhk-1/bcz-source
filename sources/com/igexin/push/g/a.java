package com.igexin.push.g;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38619a = "BasicCheck";

    private static String a(int i11) {
        String str;
        try {
            str = a(String.format("/proc/%d/cmdline", Integer.valueOf(i11))).trim();
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            str = null;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return a(String.format("/proc/%d/stat", Integer.valueOf(i11))).split("\\s+")[1].replace(pn.j.f81006c, "").replace(pn.j.f81007d, "");
            }
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
        }
        return str;
    }

    public static boolean b() {
        try {
            for (String str : com.igexin.push.config.d.B.split(",")) {
                if (n.e().toLowerCase().contains(str.toLowerCase())) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        return false;
    }

    private static boolean c() {
        try {
            for (String str : com.igexin.push.core.e.aI.split(",")) {
                if (com.igexin.push.core.e.F.toLowerCase().contains(str.toLowerCase())) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
        return false;
    }

    private static String a(String str) {
        FileReader fileReader;
        Throwable th2;
        BufferedReader bufferedReader;
        try {
            StringBuilder sb2 = new StringBuilder();
            fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                            sb2.append("\n");
                        } catch (Exception e11) {
                            e = e11;
                            com.igexin.c.a.c.a.a(e);
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception e12) {
                                    com.igexin.c.a.c.a.a(e12);
                                }
                            }
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e13) {
                                    com.igexin.c.a.c.a.a(e13);
                                }
                            }
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Exception e14) {
                                com.igexin.c.a.c.a.a(e14);
                            }
                        }
                        if (bufferedReader == null) {
                            throw th2;
                        }
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (Exception e15) {
                            com.igexin.c.a.c.a.a(e15);
                            throw th2;
                        }
                    }
                }
                if (sb2.length() > 2) {
                    String substring = sb2.substring(0, sb2.length() - 2);
                    try {
                        fileReader.close();
                    } catch (Exception e16) {
                        com.igexin.c.a.c.a.a(e16);
                    }
                    try {
                        bufferedReader.close();
                    } catch (Exception e17) {
                        com.igexin.c.a.c.a.a(e17);
                    }
                    return substring;
                }
                String sb3 = sb2.toString();
                try {
                    fileReader.close();
                } catch (Exception e18) {
                    com.igexin.c.a.c.a.a(e18);
                }
                try {
                    bufferedReader.close();
                } catch (Exception e19) {
                    com.igexin.c.a.c.a.a(e19);
                }
                return sb3;
            } catch (Exception e21) {
                e = e21;
                bufferedReader = null;
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (Exception e22) {
            e = e22;
            bufferedReader = null;
            fileReader = null;
        } catch (Throwable th5) {
            fileReader = null;
            th2 = th5;
            bufferedReader = null;
        }
    }

    public static boolean a() {
        try {
            Class.forName("com.igexin.push.g.g");
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return false;
        }
    }
}
