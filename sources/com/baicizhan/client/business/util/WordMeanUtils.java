package com.baicizhan.client.business.util;

import android.text.TextUtils;
import com.baicizhan.online.resource_api.MeanInfo;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordMeanUtils {
    private static final String REGEX = "^[a-z]+\\.\\s";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SplitMean {
        public int maxType;
        public Map<String, String> means;
        public List<String> sort;

        public static SplitMean emptyMean() {
            SplitMean splitMean = new SplitMean();
            splitMean.means = new HashMap();
            splitMean.sort = new ArrayList();
            splitMean.maxType = 0;
            return splitMean;
        }

        public String meanString() {
            if (CollectionUtils.isEmpty(this.means)) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (String str : this.means.keySet()) {
                stringBuffer.append(str);
                stringBuffer.append(" ");
                stringBuffer.append(this.means.get(str));
            }
            return stringBuffer.toString();
        }
    }

    public static String assembleCnMean(List<MeanInfo> chn_means) {
        StringBuffer stringBuffer;
        if (CollectionUtils.isEmpty(chn_means)) {
            return "";
        }
        HashMap hashMap = new HashMap();
        for (MeanInfo meanInfo : chn_means) {
            if (meanInfo.getMean_type() == null) {
                meanInfo.setMean_type("");
            }
            if (hashMap.containsKey(meanInfo.getMean_type())) {
                stringBuffer = (StringBuffer) hashMap.get(meanInfo.getMean_type());
                stringBuffer.append(meanInfo.getMean());
            } else {
                stringBuffer = new StringBuffer();
                stringBuffer.append(meanInfo.getMean());
                hashMap.put(meanInfo.getMean_type(), stringBuffer);
            }
            stringBuffer.append("；");
        }
        for (StringBuffer stringBuffer2 : hashMap.values()) {
            stringBuffer2.delete(stringBuffer2.length() - 1, stringBuffer2.length());
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        for (MeanInfo meanInfo2 : chn_means) {
            if (hashMap.containsKey(meanInfo2.getMean_type())) {
                stringBuffer3.append(meanInfo2.getMean_type());
                if (!TextUtils.isEmpty(meanInfo2.getMean_type())) {
                    stringBuffer3.append(" ");
                }
                stringBuffer3.append((StringBuffer) hashMap.get(meanInfo2.getMean_type()));
                stringBuffer3.append("\n");
                hashMap.remove(meanInfo2.getMean_type());
            }
        }
        stringBuffer3.delete(stringBuffer3.length() - 1, stringBuffer3.length());
        return stringBuffer3.toString();
    }

    public static SplitMean splitMean(String mean) {
        if (TextUtils.isEmpty(mean)) {
            return SplitMean.emptyMean();
        }
        String replace = mean.replace("\n", GlideException.a.f28776d);
        Pattern compile = Pattern.compile(REGEX);
        SplitMean splitMean = new SplitMean();
        splitMean.maxType = 0;
        splitMean.means = new TreeMap();
        splitMean.sort = new ArrayList();
        for (String str : replace.split(GlideException.a.f28776d)) {
            if (compile.matcher(str).find()) {
                String[] strArr = {str.substring(0, str.indexOf(" ")), str.substring(str.indexOf(" ") + 1, str.length())};
                if (!splitMean.sort.contains(strArr[0])) {
                    splitMean.sort.add(strArr[0]);
                    splitMean.means.put(strArr[0], strArr[1]);
                }
                if (splitMean.maxType < strArr[0].length()) {
                    splitMean.maxType = strArr[0].length();
                }
            } else {
                splitMean.sort.add("");
                splitMean.means.put("", str);
            }
        }
        return splitMean;
    }
}
