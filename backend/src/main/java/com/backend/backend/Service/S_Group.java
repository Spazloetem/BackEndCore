package com.backend.backend.Service;

import com.backend.backend.DataBaseaccessObject.D_Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class S_Group {
    @Autowired
    private D_Group DAOGroup;

    public List<String> getAuthority(Long G_ID) {
        return DAOGroup.getAuthoritybyGID(G_ID);
    }
}
