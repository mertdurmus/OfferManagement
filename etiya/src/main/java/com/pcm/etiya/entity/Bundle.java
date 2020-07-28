package com.pcm.etiya.entity;


import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bundle")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Bundle {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "name", length = 400)
  private String name;

  @Column(name = "description", length = 400)
  private String description;

  @JoinColumn(name = "offer_id")
  @OneToMany(fetch = FetchType.LAZY)
  private List<Offer> offer;

}
