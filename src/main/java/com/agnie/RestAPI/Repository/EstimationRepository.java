    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package com.agnie.RestAPI.Repository;

    import com.agnie.RestAPI.Model.Estimation;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.repository.CrudRepository;
    import org.springframework.stereotype.Repository;

    /**
     *
     * @author Admin
     */
    @Repository
    public interface EstimationRepository extends JpaRepository<Estimation, Long> {

    }
    //public interface EstimationRepository extends CrudRepository<Estimation, Long>  
    //{  
    //}
