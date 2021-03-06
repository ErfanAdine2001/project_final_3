package com.example.erfan_adine_ptest.service;


import com.example.erfan_adine_ptest.dto.out.user.WorkerOrUserSerchOutDto;
import com.example.erfan_adine_ptest.entity.product.message.Suggestion;
import com.example.erfan_adine_ptest.entity.product.message.SuggestionStatus;
import com.example.erfan_adine_ptest.exception.*;
import com.example.erfan_adine_ptest.repository.SuggestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@RequiredArgsConstructor
public class SuggestionService {
    private final SuggestionRepository suggestionRepository;

    @Transactional
    public Suggestion save(Suggestion entity) throws NullFieldException, BadEntryException, NameNotValidException, EmailNotValidException, PasswordNotValidException, NullAddresOfMainOrderException, NameOfSubServiceIsNull, NameOfMainServiceIsNull, OrderOfRequestIsNullException, NullCommentException, BasePriceOfSubServiceIsNull, RoleIsNullException, AddressOfRequestIsNull, SuggestionOfPriceIsNullException, OrderOfTransactionIsNullExeption {
        return suggestionRepository.save(entity);
    }

    @Transactional
    public Suggestion findById(Long id) {
        return suggestionRepository.findById(id).get();
    }


    @Transactional
    public List<Suggestion> findAll() {
        return suggestionRepository.findAll();
    }

//    @Transactional
//    public void update(Long id) throws NameNotValidException, NullFieldException, BadEntryException, EmailNotValidException, PasswordNotValidException, NullAddresOfMainOrderException, NameOfSubServiceIsNull, NameOfMainServiceIsNull, OrderOfRequestIsNullException, NullCommentException, BasePriceOfSubServiceIsNull, RoleIsNullException, AddressOfRequestIsNull, OrderOfTransactionIsNullExeption, SuggestionOfPriceIsNullException {
//        super.update(id);
//    }

    @Transactional
    public void delete(Long id) {
        suggestionRepository.delete(findById(id));
    }

    public Page<WorkerOrUserSerchOutDto> findAllBystatusOrder(Pageable pageable, SuggestionStatus status) {
        Page<WorkerOrUserSerchOutDto> allBystatusOrder = suggestionRepository.findAllBystatusOrder(pageable, status);
        return allBystatusOrder;
    }
}
