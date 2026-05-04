package com.baicizhan.client.business.dataset.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.online.user_study_api.EducationInfo;
import com.google.gson.d;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k9.b;
import kc.u;
import wo.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UserRecord implements Parcelable, NoProguard {
    public static final Map<String, String> COLUMN_MAP;
    public static final Parcelable.Creator<UserRecord> CREATOR;
    public static final int GAME_BETA_GAMING = 1;
    public static final int GAME_BETA_GAMING2 = 3;
    public static final int GAME_BETA_OLD = 0;
    public static final int GAME_BETA_OLD_USER = -1;
    public static final int GAME_BETA_PENDING = 2;
    public static final int LOGIN_EMAIL = 0;
    public static final int LOGIN_HUAWEI = 7;
    public static final int LOGIN_PHONE = 6;
    public static final int LOGIN_QQ = 5;
    public static final int LOGIN_RENREN = 2;
    public static final int LOGIN_TRY = 3;
    public static final int LOGIN_WEIBO = 1;
    public static final int LOGIN_WEIXIN = 4;
    public static final int SAVE_STATUS_CURRENT = 1;
    public static final int SAVE_STATUS_NULL = 0;
    public static final int SAVE_STATUS_TRY_BIND = 2;
    public static final int SEX_FEMALE = 2;
    public static final int SEX_MALE = 1;
    public static final int SEX_UNKNOWN = 3;
    public static final String[] VERBOSE_LOGIN_TYPES = {"邮箱", "微博", "人人", "试用", "微信", Constants.SOURCE_QQ, "手机", "华为"};

    @a(deserialize = false, serialize = false)
    private transient List<Integer> betaTypeList;
    private long birthday;
    private Education education;

    @a(deserialize = false, serialize = false)
    private transient String email;
    private int gameBeta;
    private String image;
    private String ipDescription;

    @a(deserialize = false, serialize = false)
    private transient boolean isNewUser;

    @a(deserialize = false, serialize = false)
    private transient String lastDevice;
    private long lastLoginTime;
    private String location;
    private int loginType;
    private String nickName;

    @a(deserialize = false, serialize = false)
    private transient int oauthAccountId;
    private String passwordMD5;
    private String phone;

    @a(deserialize = false, serialize = false)
    private transient String publicKey;
    private Role role;
    private int saveStatus;
    private int sex;
    private String token;

    @a(deserialize = false, serialize = false)
    private transient int uniqueId;
    private String user;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Education implements b, NoProguard {
        public boolean isUniversity;
        public int majorId;
        public int schoolBg;
        public int schoolId;
        public String schoolMajor;
        public String schoolName;
        public long schoolYear;

        public String toString() {
            return new d().z(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Role implements b, NoProguard {
        public int grade;
        public int role;

        public Role(int role, int grade) {
            this.role = role;
            this.grade = grade;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("user", a.b0.C0243a.f16114a);
        hashMap.put("token", a.b0.C0243a.f16115b);
        hashMap.put("loginType", a.b0.C0243a.f16116c);
        hashMap.put("passwordMD5", a.b0.C0243a.f16117d);
        hashMap.put("image", a.b0.C0243a.f16119f);
        hashMap.put("sex", a.b0.C0243a.f16120g);
        hashMap.put("nickName", a.b0.C0243a.f16121h);
        hashMap.put("saveStatus", a.b0.C0243a.f16118e);
        hashMap.put("phone", a.b0.C0243a.f16122i);
        hashMap.put("lastLoginTime", a.b0.C0243a.f16123j);
        hashMap.put("birthday", a.b0.C0243a.f16124k);
        hashMap.put(u.S, a.b0.C0243a.f16125l);
        hashMap.put("education", a.b0.C0243a.f16126m);
        hashMap.put("role", a.b0.C0243a.f16126m);
        CREATOR = new Parcelable.Creator<UserRecord>() { // from class: com.baicizhan.client.business.dataset.models.UserRecord.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UserRecord createFromParcel(Parcel in2) {
                return new UserRecord(in2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public UserRecord[] newArray(int size) {
                return new UserRecord[size];
            }
        };
    }

    public UserRecord() {
        this.sex = 3;
        this.nickName = "";
        this.education = new Education();
        this.role = null;
        this.gameBeta = -1;
        this.isNewUser = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Integer> getBetaTypeList() {
        return this.betaTypeList;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public String getDisplayName() {
        if (!TextUtils.isEmpty(this.nickName)) {
            return this.nickName;
        }
        if (getLoginType() == 3) {
            int indexOf = this.user.indexOf("@try");
            if (indexOf > 0) {
                return String.format(Locale.CHINA, "试用%s", this.user.substring(0, indexOf));
            }
        } else if (getLoginType() == 6) {
            return "无名大侠";
        }
        return this.user;
    }

    public Education getEducation() {
        return this.education;
    }

    public String getEmail() {
        return this.email;
    }

    public int getGameBeta() {
        return this.gameBeta;
    }

    public String getImage() {
        String str = this.image;
        return str == null ? "" : str;
    }

    public String getIpDescription() {
        return this.ipDescription;
    }

    public boolean getIsNewUser() {
        return this.isNewUser;
    }

    public String getLastDevice() {
        return this.lastDevice;
    }

    public long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public String getLocation() {
        return this.location;
    }

    public int getLoginType() {
        return this.loginType;
    }

    public String getNickName() {
        return this.nickName;
    }

    public int getOauthAccountId() {
        return this.oauthAccountId;
    }

    public String getPasswordMD5() {
        return this.passwordMD5;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public Role getRole() {
        return this.role;
    }

    public int getSaveStatus() {
        return this.saveStatus;
    }

    public int getSex() {
        return this.sex;
    }

    public String getThirdPartySex() {
        int i11 = this.sex;
        return i11 == 1 ? "m" : i11 == 2 ? "f" : "X";
    }

    public String getToken() {
        return this.token;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }

    public String getUser() {
        return this.user;
    }

    public String getVerboseLoginType() {
        return VERBOSE_LOGIN_TYPES[this.loginType];
    }

    public String getVerboseSex() {
        int i11 = this.sex;
        return i11 == 1 ? "男" : i11 == 2 ? "女" : "保密";
    }

    public void setBetaTypeList(List<Integer> betaTypeList) {
        this.betaTypeList = betaTypeList;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGameBeta(int gameBeta) {
        this.gameBeta = gameBeta;
    }

    public void setImage(String strprofile_image_url) {
        this.image = strprofile_image_url;
    }

    public void setIpDescription(String ipDescription) {
        this.ipDescription = ipDescription;
    }

    public void setIsNewUser(boolean isNewUser) {
        this.isNewUser = isNewUser;
    }

    public void setLastDevice(String lastDevice) {
        this.lastDevice = lastDevice;
    }

    public void setLastLoginTime(long time) {
        this.lastLoginTime = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setOauthAccountId(int oauthAccountId) {
        this.oauthAccountId = oauthAccountId;
    }

    public void setPasswordMD5(String passwordMD5) {
        this.passwordMD5 = passwordMD5;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setSaveStatus(int saveStatus) {
        this.saveStatus = saveStatus;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setThridSex(String sex) {
        if (TextUtils.equals(sex, "m")) {
            this.sex = 1;
        } else if (TextUtils.equals(sex, "f")) {
            this.sex = 2;
        } else {
            this.sex = 3;
        }
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String toString() {
        return "UserRecord{email='" + this.email + "', user='" + this.user + "', token='" + this.token + "', loginType=" + this.loginType + ", passwordMD5='" + this.passwordMD5 + "', image='" + this.image + "', sex=" + this.sex + ", nickName='" + this.nickName + "', saveStatus=" + this.saveStatus + ", isNewUser=" + this.isNewUser + ", publicKey='" + this.publicKey + "', oauthAccountId=" + this.oauthAccountId + ", uniqueId='" + this.uniqueId + "', phone='" + this.phone + "', lastLoginTime='" + this.lastLoginTime + "', lastDevice='" + this.lastDevice + "', birthday ='" + this.birthday + "', location ='" + this.location + "', education ='" + this.education.toString() + "', ipDescription ='" + this.ipDescription + '\'' + l50.b.f69928j;
    }

    public void updateEduction(EducationInfo info) {
        if (info == null) {
            return;
        }
        Education education = this.education;
        education.isUniversity = info.is_university;
        education.majorId = info.major_id;
        education.schoolBg = info.school_bg;
        education.schoolId = info.school_id;
        education.schoolMajor = info.school_major;
        education.schoolName = info.school_name;
        education.schoolYear = info.school_year;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.user);
        parcel.writeString(this.token);
        parcel.writeInt(this.loginType);
        parcel.writeString(this.passwordMD5);
        parcel.writeString(this.image);
        parcel.writeInt(this.sex);
        parcel.writeString(this.nickName);
        parcel.writeInt(this.saveStatus);
        parcel.writeByte(this.isNewUser ? (byte) 1 : (byte) 0);
        parcel.writeString(this.publicKey);
        parcel.writeString(this.email);
        parcel.writeInt(this.oauthAccountId);
        parcel.writeInt(this.uniqueId);
        parcel.writeString(this.phone);
        parcel.writeLong(this.lastLoginTime);
        parcel.writeString(this.ipDescription);
    }

    public UserRecord(Parcel in2) {
        this.sex = 3;
        this.nickName = "";
        this.education = new Education();
        this.role = null;
        this.gameBeta = -1;
        this.isNewUser = false;
        this.user = in2.readString();
        this.token = in2.readString();
        this.loginType = in2.readInt();
        this.passwordMD5 = in2.readString();
        this.image = in2.readString();
        this.sex = in2.readInt();
        this.nickName = in2.readString();
        this.saveStatus = in2.readInt();
        this.isNewUser = in2.readByte() > 0;
        this.publicKey = in2.readString();
        this.email = in2.readString();
        this.oauthAccountId = in2.readInt();
        this.uniqueId = in2.readInt();
        this.phone = in2.readString();
        this.lastLoginTime = in2.readLong();
        this.ipDescription = in2.readString();
    }
}
