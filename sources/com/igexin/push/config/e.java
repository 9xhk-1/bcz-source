package com.igexin.push.config;

import com.huawei.hms.framework.common.ContainerUtils;
import com.igexin.push.g.j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f37607a = "FileConfig";

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        com.igexin.c.a.c.a.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r0 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0040, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.push.config.e.a():void");
    }

    public static int b() {
        try {
            j.l();
            Boolean a11 = com.igexin.push.core.d.c.a().a(com.igexin.push.core.d.c.f37961a);
            int i11 = a11 == null ? -1 : a11.booleanValue() ? 1 : 0;
            com.igexin.c.a.c.a.a(f37607a + "|getGuardMeFromFile gm= " + i11, new Object[0]);
            return i11;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return -1;
        }
    }

    public static int c() {
        try {
            Boolean a11 = com.igexin.push.core.d.c.a().a(com.igexin.push.core.d.c.f37962b);
            int i11 = a11 == null ? -1 : a11.booleanValue() ? 1 : 0;
            com.igexin.c.a.c.a.a(f37607a + "|getGuardOthersFromFile gm= " + i11, new Object[0]);
            return i11;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return -1;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static void a(InputStream inputStream) {
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                bufferedReader2.close();
                                return;
                            }
                            if (!readLine.startsWith("#")) {
                                String[] split = readLine.split(ContainerUtils.KEY_VALUE_DELIMITER);
                                if (split.length >= 2) {
                                    String trim = split[0].trim();
                                    String trim2 = split[1].trim();
                                    switch (trim.hashCode()) {
                                        case -1784363506:
                                            if (trim.equals("sdk.readlocalcell.enable")) {
                                                d.f37588h = Boolean.parseBoolean(trim2);
                                                break;
                                            }
                                            break;
                                        case -1734610495:
                                            if (trim.equals("sdk.enter.backup.detect.failed.cnt")) {
                                                d.f37599s = Integer.parseInt(trim2);
                                                break;
                                            }
                                            break;
                                        case -1286040506:
                                            if (trim.equals("sdk.detect.ip.expired.time")) {
                                                d.f37601u = Long.parseLong(trim2) * 1000;
                                                break;
                                            }
                                            break;
                                        case -1050591911:
                                            if (trim.equals("sdk.feature.setsilenttime.enable")) {
                                                d.f37592l = Boolean.parseBoolean(trim2);
                                                break;
                                            }
                                            break;
                                        case -1004501973:
                                            if (trim.equals("sdk.config_address")) {
                                                SDKUrlConfig.CONFIG_ADDRESS_IPS = trim2.split(",");
                                                break;
                                            }
                                            break;
                                        case -416668775:
                                            if (trim.equals("sdk.feature.setsockettimeout.enable")) {
                                                d.f37594n = Boolean.parseBoolean(trim2);
                                                break;
                                            }
                                            break;
                                        case -367623287:
                                            if (trim.equals("sdk.address.id")) {
                                                com.igexin.push.g.g.f38690b = trim2;
                                                break;
                                            }
                                            break;
                                        case -52474114:
                                            if (trim.equals("sdk.feature.sendmessage.enable")) {
                                                d.f37590j = Boolean.parseBoolean(trim2);
                                                break;
                                            }
                                            break;
                                        case 85426222:
                                            if (trim.equals("sdk.cm_address_backup")) {
                                                SDKUrlConfig.XFR_ADDRESS_BAK = trim2.split(",");
                                                break;
                                            }
                                            break;
                                        case 178406040:
                                            if (trim.equals("sdk.stay.backup.time")) {
                                                d.f37598r = Long.parseLong(trim2) * 1000;
                                                break;
                                            }
                                            break;
                                        case 275980049:
                                            if (trim.equals("sdk.login.failed.cnt")) {
                                                d.f37600t = Integer.parseInt(trim2);
                                                break;
                                            }
                                            break;
                                        case 352273926:
                                            if (trim.equals("sdk.feature.setheartbeatinterval.enable")) {
                                                d.f37593m = Boolean.parseBoolean(trim2);
                                                break;
                                            }
                                            break;
                                        case 914256432:
                                            if (trim.equals("sdk.bi_address")) {
                                                SDKUrlConfig.BI_ADDRESS_IPS = trim2.split(",");
                                                break;
                                            }
                                            break;
                                        case 1188929677:
                                            if (trim.equals("sdk.feature.settag.enable")) {
                                                d.f37591k = Boolean.parseBoolean(trim2);
                                                break;
                                            }
                                            break;
                                        case 1457933893:
                                            if (trim.equals("sdk.log_address")) {
                                                SDKUrlConfig.LOG_ADDRESS_IPS = trim2.split(",");
                                                break;
                                            }
                                            break;
                                        case 1488582065:
                                            if (trim.equals("sdk.address.key")) {
                                                com.igexin.push.g.g.f38689a = trim2;
                                                break;
                                            }
                                            break;
                                        case 1603576119:
                                            if (trim.equals("sdk.domainbackup.enable")) {
                                                d.f37587g = Boolean.parseBoolean(trim2);
                                                break;
                                            }
                                            break;
                                        case 1676315519:
                                            if (trim.equals("sdk.detect.interval.time")) {
                                                d.f37602v = Long.parseLong(trim2) * 1000;
                                                break;
                                            }
                                            break;
                                        case 2077859667:
                                            if (trim.equals("sdk.cm_address")) {
                                                SDKUrlConfig.setXfrAddressIps(trim2.split(","));
                                                break;
                                            }
                                            break;
                                    }
                                    com.igexin.c.a.c.a.a(f37607a, "loadConfigFromFile, config line:".concat(readLine));
                                }
                            }
                        } catch (Exception unused) {
                            bufferedReader = bufferedReader2;
                            com.igexin.c.a.c.a.a(f37607a + "｜no config file found.", new Object[0]);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e11) {
                                    com.igexin.c.a.c.a.a(e11);
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
        }
    }

    private static void b(Boolean bool) {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(j.f38711e);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!readLine.startsWith("#")) {
                            String[] split = readLine.split(ContainerUtils.KEY_VALUE_DELIMITER);
                            if (split.length >= 2) {
                                String trim = split[0].trim();
                                split[1].getClass();
                                if (!trim.equals("sdk.debug")) {
                                }
                            }
                        }
                        sb2.append(readLine);
                        sb2.append("\n");
                    }
                    sb2.append("sdk.debug=".concat(String.valueOf(bool)));
                    byte[] bytes = sb2.toString().getBytes();
                    if (bytes != null) {
                        j.a(bytes, j.f38711e);
                    }
                    try {
                        bufferedReader2.close();
                    } catch (IOException e11) {
                        com.igexin.c.a.c.a.a(e11);
                    }
                } catch (Exception unused) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e12) {
                            com.igexin.c.a.c.a.a(e12);
                        }
                    }
                    if (fileInputStream == null) {
                        return;
                    }
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e13) {
                            com.igexin.c.a.c.a.a(e13);
                        }
                    }
                    if (fileInputStream == null) {
                        throw th;
                    }
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Exception e14) {
                        com.igexin.c.a.c.a.a(e14);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        try {
            fileInputStream.close();
        } catch (Exception e15) {
            com.igexin.c.a.c.a.a(e15);
        }
    }

    public static void a(Boolean bool) {
        try {
            j.l();
            if (new File(j.f38711e).exists()) {
                b(bool);
                return;
            }
            byte[] bytes = "sdk.debug=".concat(String.valueOf(bool)).getBytes();
            if (bytes != null) {
                j.a(bytes, j.f38711e);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }

    public static void a(boolean z11, boolean z12) {
        try {
            j.l();
            com.igexin.push.core.d.c.a().a(com.igexin.push.core.d.c.f37961a, Boolean.valueOf(z11));
            com.igexin.push.core.d.c.a().a(com.igexin.push.core.d.c.f37962b, Boolean.valueOf(z12));
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
        }
    }
}
