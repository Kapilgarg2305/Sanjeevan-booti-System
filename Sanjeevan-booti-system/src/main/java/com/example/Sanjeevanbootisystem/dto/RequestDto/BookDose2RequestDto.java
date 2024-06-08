package com.example.Sanjeevanbootisystem.dto.RequestDto;

import com.example.Sanjeevanbootisystem.Enum.DoseType;
import lombok.*;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDose2RequestDto {

    int personId;

    DoseType doseType;
}
