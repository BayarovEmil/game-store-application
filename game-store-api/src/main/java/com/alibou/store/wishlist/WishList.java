package com.alibou.store.wishlist;

import com.alibou.store.common.BaseEntity;
import com.alibou.store.game.Game;
import com.alibou.store.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WishList extends BaseEntity {
    private String name;

    @OneToOne
    private User user;

    @ManyToMany(mappedBy = "wishlists", fetch = FetchType.EAGER)
    private List<Game> games;

}
