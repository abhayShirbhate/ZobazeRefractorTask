package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.zobaze.zobazerefractortask.DataBinderMapperImpl());
  }
}
