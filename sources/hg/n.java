package hg;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.baicizhan.main.fragment.PatternChunkFragment;
import com.baicizhan.main.fragment.PatternClozeFragment;
import com.baicizhan.main.fragment.PatternPicToChinFragment;
import com.baicizhan.main.fragment.PatternSenToChinFragment;
import com.baicizhan.main.fragment.PatternSenToPicFragment;
import com.baicizhan.main.fragment.PatternWordToPicFragment;
import com.baicizhan.main.plusreview.fragment.ListenFragment;
import com.baicizhan.main.plusreview.fragment.MeanToWordFragment;
import com.baicizhan.main.plusreview.fragment.WordReadingFragment;
import com.baicizhan.main.plusreview.fragment.WriteFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray<List<PatternBaseFragment>> f59302a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f59303b = {21, 22, 23};

    public static void a() {
        qb.c.b("leijie", "PatternFactory clear instances", new Object[0]);
        f59302a.clear();
    }

    public static List<PatternBaseFragment> b(int pattern) {
        SparseArray<List<PatternBaseFragment>> sparseArray = f59302a;
        List<PatternBaseFragment> list = sparseArray.get(pattern);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(2);
        sparseArray.put(pattern, arrayList);
        return arrayList;
    }

    public static boolean c(int patternType) {
        for (int i11 : f59303b) {
            if (i11 == patternType) {
                return true;
            }
        }
        return false;
    }

    public static PatternBaseFragment d(Context context, int pattern, int category) {
        PatternBaseFragment patternSenToPicFragment;
        List<PatternBaseFragment> b11 = b(pattern);
        if (b11.size() > 0) {
            PatternBaseFragment remove = b11.remove(b11.size() - 1);
            if (remove.getParent() != null) {
                ((ViewGroup) remove.getParent()).removeView(remove);
            }
            return remove;
        }
        if (pattern == 1) {
            patternSenToPicFragment = new PatternSenToPicFragment(context, category);
        } else if (pattern == 2) {
            patternSenToPicFragment = new PatternWordToPicFragment(context, category);
        } else if (pattern == 3) {
            patternSenToPicFragment = new PatternPicToChinFragment(context, category);
        } else if (pattern == 4) {
            patternSenToPicFragment = new WriteFragment(context, category);
        } else if (pattern == 5) {
            patternSenToPicFragment = new WordReadingFragment(context, category);
        } else if (pattern != 8) {
            switch (pattern) {
                case 21:
                    patternSenToPicFragment = new PatternClozeFragment(context, category);
                    break;
                case 22:
                    patternSenToPicFragment = new PatternChunkFragment(context, category);
                    break;
                case 23:
                    patternSenToPicFragment = new ListenFragment(context, category);
                    break;
                case 24:
                    patternSenToPicFragment = new MeanToWordFragment(context, category);
                    break;
                default:
                    throw new RuntimeException("invalid pattern type " + pattern);
            }
        } else {
            patternSenToPicFragment = new PatternSenToChinFragment(context, category);
        }
        patternSenToPicFragment.setPatternType(pattern);
        return patternSenToPicFragment;
    }

    public static void e(PatternBaseFragment view) {
        int patternType = view.getPatternType();
        if (c(patternType)) {
            return;
        }
        b(patternType).add(view);
    }

    public static void f(Context context, int patternType, int count, int category) {
        if (c(patternType)) {
            return;
        }
        for (int i11 = 0; i11 < count; i11++) {
            e(d(context, patternType, category));
        }
    }
}
