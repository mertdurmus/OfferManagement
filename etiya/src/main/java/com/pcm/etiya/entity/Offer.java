package com.pcm.etiya.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "offer")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Offer {

  @Id
  @GeneratedValue
  private Long id;
  @Column(name = "category", length = 100)
  private String category;
  @Column(name = "name", length = 100)
  private String  name;
  @Column(name = "description", length = 400)
  private String description;
  @Column(name = "price", length = 30)
  private Float price;
  // private Photo photo;
  @JoinColumn(name = "bundle_id")
  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private Bundle bundle;


}
