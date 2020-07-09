package org.csu.ffms.persistence;

import org.csu.ffms.domain.Disburse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisburseMapper {

    void newDisburse(Disburse disburse);
    void deleteDisburse(int disburseId);
    void updateDisburse(Disburse disburse);
    List<Disburse> findDisburseList(Disburse disburse);
}