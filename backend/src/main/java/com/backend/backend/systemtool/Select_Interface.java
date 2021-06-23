package com.backend.backend.systemtool;

import java.util.List;

public interface Select_Interface <T>{
    List<T> GetResult() throws Exception;
}
