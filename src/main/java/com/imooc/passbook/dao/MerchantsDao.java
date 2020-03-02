package com.imooc.passbook.dao;

import com.imooc.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <h1>Merchants Dao interface</h1>
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     * <h2>get merchant object by its id</h2>
     * @param id merchant's id
     * @return {@link Merchants}
     */
    Merchants findById(Integer id);

    /**
     * <h2>get merchant object by its name</h2>
     * @param name merchant's name
     * @return {@link Merchants}
     */
    Merchants findByName(String name);

    /**
     * <h2>get merchants objects by their ids</h2>
     * @param ids merchants' ids
     * @return {@link List<Merchants>}
     */
    List<Merchants> findByIdIn(List<Integer> ids);
}
