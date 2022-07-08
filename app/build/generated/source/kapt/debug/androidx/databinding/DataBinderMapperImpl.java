package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new net.sdcor.cardivu_android_demo.DataBinderMapperImpl());
  }
}
